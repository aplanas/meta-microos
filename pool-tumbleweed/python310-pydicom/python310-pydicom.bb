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

RPM_NAME = "python310-pydicom-2.3.1-1.4.noarch.rpm"
RPM_HASH = "18cd48d26cccf189362253df64cb2732dc5dd2db81ca5fa32cdad32145ac01610ed192ccbfcc30c00a6270c7d1dd1718f5ebe26e0c6949d9feaacd53a4f5c7e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydicom \
python3.10dist(pydicom) \
python310-pydicom \
python3dist(pydicom)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
