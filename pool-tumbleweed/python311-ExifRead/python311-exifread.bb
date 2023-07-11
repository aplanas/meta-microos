SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-ExifRead-3.0.0-1.6.noarch.rpm"
RPM_HASH = "fc72e8eadeba9053a0fb551d9c5b4b816a97a967088f9d72914f0717ff804eac686aa11e2401b15f498b07da2e0abcb4b899930e0c0d893f27c8741becf6951d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ExifRead \
python3.11dist-exifread \
python311-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
