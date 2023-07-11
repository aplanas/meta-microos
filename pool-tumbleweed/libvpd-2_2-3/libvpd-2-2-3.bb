SUMMARY = "VPD Database access library for lsvpd"
DESCRIPTION = "The libvpd package contains classes that are used to access a Vital \
Product Data (VPD) database created by vpdupdate in the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.9"

RPM_NAME = "libvpd-2_2-3-2.2.9-3.4.aarch64.rpm"
RPM_HASH = "361b5ba0fd82379e4aab7973ca11a52a936c73068cc89a18b380a5122ee700425e642e90c1b4d21cbd44ebf5fdc004cbab4e953a7fb7b5ebcaf04e3b5996c6ff"

RPROVIDES:${PN} += "libvpd-2-2-3 \
libvpd-2.2.so.3 \
libvpd-cxx-2.2.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libvpd-base"

inherit rpm
