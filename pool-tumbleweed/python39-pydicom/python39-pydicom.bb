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

RPM_NAME = "python39-pydicom-2.3.1-1.4.noarch.rpm"
RPM_HASH = "bd91aaaba920a9bc4c279ac382cbf98bf4024c7308f248e372b747efa0877eb0a59e3a0b2a789f4bb02329fe4c0b214a63eb6b8dd42c22e3274a5707359b8825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydicom) \
python39-pydicom \
python3dist(pydicom)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
