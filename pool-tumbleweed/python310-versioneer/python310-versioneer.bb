SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python310-versioneer-0.28-1.3.noarch.rpm"
RPM_HASH = "1fd005f43a83c6c67e429f48d8fa8c4d54d880c4548230914cfca2760768447dab12fcfa7c979de66163c953113cfd600ab6db31b5bd3c0a0fa41ef2e32b7dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-versioneer \
python310-versioneer \
python3dist-versioneer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
