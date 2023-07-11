SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python310-czifile-2019.7.2-2.11.noarch.rpm"
RPM_HASH = "19a76ebc7bf91e0e96a3bdff09e267c8adb314c3985743186c75633492a5ab29fe1f2d5b668f713ffb9c4b4400d40a8cc1bf6966a69c773ad2f93258ba4199c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-czifile \
python310-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-imagecodecs \
python310-numpy \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
