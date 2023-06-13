SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python310-versioneer-0.28-1.1.noarch.rpm"
RPM_HASH = "caaf8439a71ce0a1a4ab79f0715419c7453a3cce5c0b523983bedfefc2f93974ffffd4dba9e1770e30c91cbc280c812426acebf38edeea2b45867d8e1889a8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer \
python3.10dist(versioneer) \
python310-versioneer \
python3dist(versioneer)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
