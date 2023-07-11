SUMMARY = "Pure python package for DICOM medical file reading and writing"
DESCRIPTION = "pydicom is a pure python package for parsing DICOM files \
into natural pythonic structures for further manipulation. \
Modified datasets can be written again to DICOM format files. \
 \
DICOM is a standard (http://medical.nema.org) for communicating \
medical images and related information such as reports \
and radiotherapy objects."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-pydicom-2.3.1-1.6.noarch.rpm"
RPM_HASH = "cdfea627738bd01764740d430e5f1813166cb96327d3b9d3aed9dee3d79c3c22c2b0c82a2f5a3631c1cdbed882f64146a7927f362f83dbfa0da789b71ac743ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydicom \
python3.11dist-pydicom \
python311-pydicom \
python3dist-pydicom"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
