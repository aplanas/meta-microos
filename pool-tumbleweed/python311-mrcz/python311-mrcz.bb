SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python311-mrcz-0.5.6-2.7.noarch.rpm"
RPM_HASH = "cbe43220a048cdd267d3ae7bd9f841e432a10ef5aa16f6ccc02e5087d7c7439c816ae465de0dbe8c1d43e541f404e8866137643909f1957ecaac957193f38dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mrcz) \
python311-mrcz \
python3dist(mrcz)"

RDEPENDS:${PN} += "python(abi) \
python311-blosc \
python311-numpy"

inherit rpm
