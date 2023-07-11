SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python39-nibabel-4.0.2-1.6.noarch.rpm"
RPM_HASH = "851be9c3a0627b064f3c9240ed77dd502043c55c6dc690adc2080ff707b8f719b3d4304140f6b9c9058ddc1de582ebe03f438a59275730aa0e7237833ef48e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nibabel \
python39-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
