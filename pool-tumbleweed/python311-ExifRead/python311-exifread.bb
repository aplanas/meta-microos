SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-ExifRead-3.0.0-1.5.noarch.rpm"
RPM_HASH = "e10b2a66424551b857cbb124d3c1967ecc2969abfc68f1ffaa313c7405ef2e5a8c49f6da727e8118bf7163654e0b7d389e9d44a6c6a5d91051315bf2ef90c221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(exifread) \
python311-ExifRead \
python3dist(exifread)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
