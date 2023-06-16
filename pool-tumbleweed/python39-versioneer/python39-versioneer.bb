SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python39-versioneer-0.28-1.1.noarch.rpm"
RPM_HASH = "504e0b7ddf3ceb5f1f490a76345e103c4667532da3c9717d864e5f816ade7fd53a5fdff6341f6f341e66a2a8e7499074bf7129c7de6883b20c6520897c708203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-versioneer \
python39-versioneer \
python3dist-versioneer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
