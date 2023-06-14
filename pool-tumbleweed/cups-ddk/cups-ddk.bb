SUMMARY = "CUPS Driver Development Kit"
DESCRIPTION = "The CUPS Driver Development Kit (DDK) provides \
a suite of standard drivers, a PPD file compiler, \
and other utilities that can be used to develop \
printer drivers for CUPS."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-ddk-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "266e0351937e3714a88041d5a7d71845cb3ebe6dd07c074e3e19a265bbd37f130d015f1e0fd8ca12e8dcb0d8c7b2a0cc93a35a4f26eeaeba9b5006d48d8be3e2"

RPROVIDES:${PN} += "cups-ddk \
cupsddk"

RDEPENDS:${PN} += "cups \
cups-devel \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
