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

RPM_NAME = "python310-pydicom-2.3.1-1.6.noarch.rpm"
RPM_HASH = "ff344c9cb7ed765b652ca95a22f70044ecc44b16f218eb92883b215a8cc7b3d7e6b398ff2b66070c9a573836c7feaeec1eeb8096bb1fe15f76f4783cda326641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydicom \
python310-pydicom \
python3dist-pydicom"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
