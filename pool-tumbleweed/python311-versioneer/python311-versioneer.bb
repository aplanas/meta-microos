SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python311-versioneer-0.28-1.1.noarch.rpm"
RPM_HASH = "bd104be9e8ed9ca158634eb8fcb945617a3de7fdf3fa45934e1011b5b57dc7f3dd465c1b5989ae343e921fa1f6cdf35863dd0847a36d51a28d5af17140f204b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(versioneer) \
python311-versioneer \
python3dist(versioneer)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
