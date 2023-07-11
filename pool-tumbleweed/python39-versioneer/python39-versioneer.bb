SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python39-versioneer-0.28-1.3.noarch.rpm"
RPM_HASH = "f8f00c1c10439ba7c775785b924a87794764a350f11591bc40b017bb45c52db408b8112883d08522cfb45408a3d65652beaf38b4e1f1332aeec72c0b180ec296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-versioneer \
python39-versioneer \
python3dist-versioneer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
