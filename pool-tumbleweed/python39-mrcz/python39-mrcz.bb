SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python39-mrcz-0.5.6-2.9.noarch.rpm"
RPM_HASH = "9d15ffe03f624f677cf8a56a09b57205ae2b71c9fe16e6ff575d55d0c42d6afba46b771f37e16977543633d50e30f86e62cb63f00d3a05991e8a3458212323b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mrcz \
python39-mrcz \
python3dist-mrcz"

RDEPENDS:${PN} += "python-abi \
python39-blosc \
python39-numpy"

inherit rpm
