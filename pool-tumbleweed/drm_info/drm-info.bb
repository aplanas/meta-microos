SUMMARY = "Small utility to dump info about DRM devices"
DESCRIPTION = "Small utility to dump info about DRM devices."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "drm_info-2.5.0-1.2.aarch64.rpm"
RPM_HASH = "d0ce4178a956f5b9ebcbdfd9f11e487a397b997e9ae0342df02ab794824ebc1af3736f9d8c9c98e4e7f28144ae09161c7d2a89385579f2f05990280df0a9cfa4"

RPROVIDES:${PN} += "drm-info"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libjson-c.so.5 \
libpci.so.3"

inherit rpm
