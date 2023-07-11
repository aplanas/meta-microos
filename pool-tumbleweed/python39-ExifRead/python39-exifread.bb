SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python39-ExifRead-3.0.0-1.6.noarch.rpm"
RPM_HASH = "284460a02371b3ab433d827df98259d8d90cf4a192658f1e068b402509f7c8a6ed8aa362d99f050da3d444093c9e052c7f9a747d487e8cbce96c34d2621a62d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-exifread \
python39-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
