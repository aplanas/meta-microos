SUMMARY = "Files needed for NFC development"
DESCRIPTION = "Files needed to develop applications for the NFC stack."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "neard-devel-0.18-1.4.aarch64.rpm"
RPM_HASH = "57def9f048362ff630f91773382ee8d918f0e655c11ad1658653aaab1861d1f75aeba4b8e99f383303d98af1a2ea1ccaffd3b7ac5be704225b4834c68f63ee13"

RPROVIDES:${PN} += "neard-devel \
pkgconfig-neard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-libnl-3.0 \
pkgconfig-libnl-genl-3.0"

inherit rpm
