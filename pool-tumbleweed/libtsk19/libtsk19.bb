SUMMARY = "Library for file system and volume forensic analysis"
DESCRIPTION = "The libtsk19 package contains library for sleuthkit. \
 \
The name of the library was changed from libtsk3 to libtsk"
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "libtsk19-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "c0e6c626f0a193a374c2c94cc009fc89ebbef9d56b572bfa798180632b331b05f8bf622565e09c36dcb608e06ff2da9795a519b39ef8613fda70bc3ab1004ba8"

RPROVIDES:${PN} += "libtsk.so.19 \
libtsk19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libewf.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
