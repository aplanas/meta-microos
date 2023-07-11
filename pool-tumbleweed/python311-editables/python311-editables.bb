SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python311-editables-0.3-2.2.noarch.rpm"
RPM_HASH = "f7397cebd08b5df49c9325224c8a331629b15c65048a199f9443947cf81680f433ffa883b2f9bdaf96dff8fdb87a667dd05ea182cfee84c4b367aa6c254d9dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-editables \
python3.11dist-editables \
python311-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
