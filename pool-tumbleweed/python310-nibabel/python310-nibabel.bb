SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python310-nibabel-4.0.2-1.6.noarch.rpm"
RPM_HASH = "6ae21c21819300dcf12f1c0477aa82d7b7e98693d520a14bb392d3bef27544618d9bffbb55deacdf169728ab88c9942682b8d5600b8dd383c5a87cc9c8ea5fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nibabel \
python310-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
