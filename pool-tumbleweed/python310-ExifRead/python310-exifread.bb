SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python310-ExifRead-3.0.0-1.5.noarch.rpm"
RPM_HASH = "bc5311e53394ce8c5849a86763518cd69056a33f3e2583184f6f5ffc200d4a78e537c4cc008d89b7e43d7b01500dd613c236714d853d70ea31585d6e1f95970f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ExifRead \
python3.10dist-exifread \
python310-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
