SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python311-mrcz-0.5.6-2.9.noarch.rpm"
RPM_HASH = "32ba7bca220c7db552b517f743aa46bb08340bfe84bee0638f3aeb130b8177d3a7446525f2eb83e6bcf6a04532858e2425c33bf4e1c20b05cc3d146a330a6d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mrcz \
python3.11dist-mrcz \
python311-mrcz \
python3dist-mrcz"

RDEPENDS:${PN} += "python-abi \
python311-blosc \
python311-numpy"

inherit rpm
