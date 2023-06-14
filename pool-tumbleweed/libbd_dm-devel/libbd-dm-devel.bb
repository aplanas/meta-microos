SUMMARY = "Development files for the libbd_dm plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_dm plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_dm-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "465e7ebd31ce8800e2fe40e380b6335ff10b7a161a54f0f32aa7ffe8df71d2f704fd87581c1644c8eb33b7208d05bda59530fc3a7eb79c6c441b9f0ff842f75d"

RPROVIDES:${PN} += "libbd-dm-devel \
libblockdev-dm-devel"

RDEPENDS:${PN} += "device-mapper-devel \
dmraid-devel \
glib2-devel \
libbd-dm2 \
libbd-utils-devel \
systemd-devel"

inherit rpm
