SUMMARY = "Library to identify wacom tablets"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom9-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "9ffd436d01f884dc66113b86f4bdc87994b06b241faabde5d03b376e662b87327acc0dfbecca086ccf418659e4179b77791f5ed9390ee9f8fce347399f4915b1"

RPROVIDES:${PN} += "libwacom.so.9 \
libwacom9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libwacom-data"

inherit rpm
