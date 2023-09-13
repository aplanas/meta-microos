SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libsss_nss_idmap-devel-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "3d6692baabe9fcb33a4834e6d3933ab243c447cb5a7d6827d6b0f74ac2752c70dff554a3adc9c3caa3bafdf7426bd56f9d84450fafcb06593eaa24df9bda452d"

RPROVIDES:${PN} += "libsss-nss-idmap-devel \
pkgconfig-sss-nss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-nss-idmap0"

inherit rpm
