SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python310-czifile-2019.7.2-2.9.noarch.rpm"
RPM_HASH = "553de9c159d60b1673c4cd27ec05f380740b48cf367ef626ed8a90ffb0e1dd9d7edff8465751f02e32dc08148e4c35a45f72e610f46a9e3fd48846282001cac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-czifile \
python3.10dist-czifile \
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
