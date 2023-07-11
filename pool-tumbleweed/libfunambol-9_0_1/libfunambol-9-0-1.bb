SUMMARY = "C++ SyncML Client Engine"
DESCRIPTION = "Libfunambol allows to integrate a SyncML stack in a C++ application on a \
variety of platforms. Currently, Windows, Windows Mobile and Linux, Mac OS X, \
iPhone and Symbian are actively supported, but you can easily build it on other \
Unixes or other mobile/embedded platforms."
LICENSE = "AGPL-3.0"

PV = "9.0.1"

RPM_NAME = "libfunambol-9_0_1-9.0.1-16.25.aarch64.rpm"
RPM_HASH = "02328a2a3bec07ecd4bd8aac6e1b264a3626351c0c87e4bb090678f3979d48ea0647b51eb1058b8724572b148a800b6976a483ac50afaf9114950fa6f44e4c77"

RPROVIDES:${PN} += "libfunambol-9-0-1 \
libfunambol-9.0.1.so \
libfunambol9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
