SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "python311-mrcfile-1.4.3-2.3.noarch.rpm"
RPM_HASH = "484fa5a2f6db0251947e6785492bc642a66dbb7816d78ef266c987f70ebef14efbe0a3f1ef01fc6b11fad168ec96982b25e9db8a5cf812ccf06c1e190ebbdd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mrcfile \
python3.11dist-mrcfile \
python311-mrcfile \
python3dist-mrcfile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
