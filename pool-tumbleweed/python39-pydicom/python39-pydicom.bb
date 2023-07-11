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

RPM_NAME = "python39-pydicom-2.3.1-1.6.noarch.rpm"
RPM_HASH = "28a743c73b19fb1d24a15be0fca0a277ecbccdce0b5b996ccae42f26f56630ff3891280c7ddfc10e431436f0eb3d773c028927cec2275f2a5a1706b69267740c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydicom \
python39-pydicom \
python3dist-pydicom"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
