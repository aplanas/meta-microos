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

RPM_NAME = "python311-pydicom-2.3.1-1.4.noarch.rpm"
RPM_HASH = "cdb966320f8541313098d9d9f74fd8f02a326fa5161ccf0aaaeba822f02774b017f0c59e5f6901b117f9f4d477ea864aa7d2d6862569cb5426150f4bf1b19095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pydicom \
python311-pydicom \
python3dist-pydicom"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
