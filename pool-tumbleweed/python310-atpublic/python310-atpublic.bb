SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python310-atpublic-3.1.1-3.3.noarch.rpm"
RPM_HASH = "265228876e9e4c85c64e230071fc1f2c7689b5603f4e192ce2b24fe01cee9abda9b994fc3f4144ada764c5c68f08e6e163cdd75b409b1caa4920c429a5646056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-atpublic \
python310-atpublic \
python3dist-atpublic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
