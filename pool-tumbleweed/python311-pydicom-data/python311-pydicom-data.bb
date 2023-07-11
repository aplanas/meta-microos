SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pydicom-data-1.0.0-1.5.noarch.rpm"
RPM_HASH = "d2dc763e9f86542b5746b3d3034d8f932e49f65d73faf02794e54efd42588f0c3ad5493baf2b1854d3b41d58ec6b6c9cbd2b3ac5d94b99441a4142a875b38bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydicom-data \
python3.11dist-pydicom-data \
python311-pydicom-data \
python3dist-pydicom-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
