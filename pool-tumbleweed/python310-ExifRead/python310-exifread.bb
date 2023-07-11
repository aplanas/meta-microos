SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python310-ExifRead-3.0.0-1.6.noarch.rpm"
RPM_HASH = "92a25044660c20e175011322feea33d184a1f68ead5b7630dd70bd42ef3661f442c7d2a0a5ddcabc6352d3cdd32c3b6cd8215ed8770abad7e3d212841fcd7e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-exifread \
python310-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
