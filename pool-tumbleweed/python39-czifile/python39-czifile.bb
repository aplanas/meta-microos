SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python39-czifile-2019.7.2-2.9.noarch.rpm"
RPM_HASH = "e1974985491ddea39846f80c5ab5297525017838c8f80bab064bd2a68604f2dbd3efc2cbfb85cf4271ebbe5604523ba954e68352582c8b07aba2454e931e0c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(czifile) \
python39-czifile \
python3dist(czifile)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-imagecodecs \
python39-numpy \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
