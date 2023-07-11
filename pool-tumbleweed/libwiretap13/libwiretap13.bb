SUMMARY = "Wireshark library for tapping"
DESCRIPTION = "Wiretap, part of the Wireshark project, is a library that allows one to read \
and write several packet capture file formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "libwiretap13-4.0.6-3.1.aarch64.rpm"
RPM_HASH = "86bf188dbbe70549488730c030faac4538dfd9c27679273a923c82d8b2238a7043e3589564615b3001cb27656e89c992c412a474c9764bd964ab9926c2c4d0f2"

RPROVIDES:${PN} += "libwiretap.so.13 \
libwiretap13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
liblz4.so.1 \
libwsutil.so.14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
