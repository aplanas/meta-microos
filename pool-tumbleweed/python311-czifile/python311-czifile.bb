SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python311-czifile-2019.7.2-2.11.noarch.rpm"
RPM_HASH = "da1d2eb21e15fc7461322f5be2357b5b73d42c5fb1c2f2484c15d8cb73e32314806f99b4b579c5f7cdc3b606f790b5df257649cb51f97210f549705a5e38baa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-czifile \
python3.11dist-czifile \
python311-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-imagecodecs \
python311-numpy \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
