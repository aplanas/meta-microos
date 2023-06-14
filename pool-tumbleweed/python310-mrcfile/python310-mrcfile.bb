SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "python310-mrcfile-1.4.3-2.1.noarch.rpm"
RPM_HASH = "40d2a1e4ba2c00fdcdc722f3f203fe6b225b15c814feaee73b5a858ec0e566214a5e903a13619e264790d6fe168666a1abd380275359e79b6fe8e05b018b0a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mrcfile \
python3.10dist-mrcfile \
python310-mrcfile \
python3dist-mrcfile"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
