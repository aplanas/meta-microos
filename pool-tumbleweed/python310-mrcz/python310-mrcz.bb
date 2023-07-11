SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python310-mrcz-0.5.6-2.9.noarch.rpm"
RPM_HASH = "049ea4602d4486a2cb9c7c826ba4a2581b3de30b383dd5e67d0ae46540948c44751316b4eea4b1ee82611842f4fd272d5aa76ac1f3aaa5cb8704288e8a6799d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mrcz \
python310-mrcz \
python3dist-mrcz"

RDEPENDS:${PN} += "python-abi \
python310-blosc \
python310-numpy"

inherit rpm
