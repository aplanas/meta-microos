SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "python310-mrcfile-1.4.3-2.3.noarch.rpm"
RPM_HASH = "622b6fea01d5f9333383af72c98713119c279d3b6f36a2203e5bf1663055065031b26dd6955d9a5c5b3f76e7e40d1d15897d2b65eb7bd71c40807bb703cc5496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mrcfile \
python310-mrcfile \
python3dist-mrcfile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
