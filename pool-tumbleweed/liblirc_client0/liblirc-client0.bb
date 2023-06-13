SUMMARY = "LIRC client library"
DESCRIPTION = "The LIRC client library. To actually use LIRC the lircd daemon from \
the 'lirc' package has to be configured and started."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc_client0-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "ccd90cbab221bd77cc796201c09691e59bd121c59aa55b4f4dafaf4fc1673803b98d64a3eac81ef72e7919aaca6d365bd109a82e9fa21b4915b5bd2be0968b4f"

RPROVIDES:${PN} += "liblirc_client.so.0()(64bit) \
liblirc_client0 \
liblirc_client0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
