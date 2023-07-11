SUMMARY = "C wrapper for libcmis, a library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis-c is a C client library for the CMIS (Content Management \
Interoperability Services) interface. This allows C applications to \
connect to any CMIS-enabled repositories. It is only a wrapper for \
its C++ sister library libcmis."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-c-0_5-5-0.5.2-1.25.aarch64.rpm"
RPM_HASH = "119deb52380293d898e8be0b4256d04d9e4a2003b6ffda015f1db5baf761092cb0ff77691271dd72eb058a14f9169c7683c1036523cd15f46cae50891e0c1ff7"

RPROVIDES:${PN} += "libcmis-c-0-5-5 \
libcmis-c-0.5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmis-0.5.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
