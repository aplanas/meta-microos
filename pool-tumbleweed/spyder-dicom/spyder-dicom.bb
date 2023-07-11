SUMMARY = "DICOM I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
DICOM files."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "spyder-dicom-5.4.3-1.2.noarch.rpm"
RPM_HASH = "1f78cca4b68f3f1c3755451f908b5d39d28229073bc9208e274be1f3e6135b812fbc9373144a3e4d327eb10128a8358a46ee72a263abc83578fe6d76fabd51da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-dicom \
spyder3-dicom"

RDEPENDS:${PN} += "python-abi \
python3-pydicom \
spyder"

inherit rpm
