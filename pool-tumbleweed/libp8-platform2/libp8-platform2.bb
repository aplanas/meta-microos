SUMMARY = "Platform support library used by libCEC and binary add-ons for Kodi"
DESCRIPTION = "Platform support library used by libCEC and binary add-ons for Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0.1"

RPM_NAME = "libp8-platform2-2.1.0.1-3.14.aarch64.rpm"
RPM_HASH = "fa97a6162a32a54dad806acde3178e18f63c6736967aeacb5d71e91e3a1cb5a8ecbc034ccf7bb0b5c14113fc9d09cbc2170562800350dc8595cee6fb1541e07f"

RPROVIDES:${PN} += "libp8-platform.so.2 \
libp8-platform2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
