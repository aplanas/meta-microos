SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.90-1.28.aarch64.rpm"
RPM_HASH = "e7d96a46b694fb7a1cba0edbfe84dffb48370d27d7a51f5f6953542278f3d7b96aa0a3e02e5e2cc8f725be71df8c6cd784b14e9e9e8d5c46a661ecd7a788daa3"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
