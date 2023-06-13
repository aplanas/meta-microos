SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python311-nibabel-4.0.2-1.4.noarch.rpm"
RPM_HASH = "885a11260b434f782e9ca8a720d2497cb9719639215f5db3028dcc221f5827d1394b39e806983df6dd7168a71536569e004ab6ed07add84101700083bb766aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nibabel) \
python311-nibabel \
python3dist(nibabel)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-numpy \
update-alternatives"

inherit rpm
