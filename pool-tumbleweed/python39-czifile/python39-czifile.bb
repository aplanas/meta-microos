SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python39-czifile-2019.7.2-2.11.noarch.rpm"
RPM_HASH = "9314fb9bb10fafb204cdca8525a4248c968ddbe810a41883994bb0069ae74a4fd89a4ea246d273285c312d52f8a4c0901a89740aa624e82d416f01c6c57a2631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-czifile \
python39-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-imagecodecs \
python39-numpy \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
