SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python39-ExifRead-3.0.0-1.5.noarch.rpm"
RPM_HASH = "d874f57cbd527481131f3f96d7247b665741180b5db851e250e0d7b23c0e4f1f9b8dc1c1b9587c59b78608ac5a3277a9984d848404fe3abfe6e0fb25919b89a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-exifread \
python39-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
