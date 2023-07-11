SUMMARY = "D-Bus controlling service for transactional updates"
DESCRIPTION = "This package provedes the D-Bus service to access libtukit4's \
functionality to manage transactional systems."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "tukitd-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "be6b61ff8a7d2011f3a7556ea1e2a4ad64e292382dd567f4d649dd5105c11807a61e57924062c426e8fe47bae3493d9fe857afd2f852c5397ad38ea87483065d"

RPROVIDES:${PN} += "tukitd"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libtukit.so.4 \
libtukit4"

inherit rpm
