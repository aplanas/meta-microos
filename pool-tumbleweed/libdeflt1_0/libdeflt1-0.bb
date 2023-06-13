SUMMARY = "Library to parse sysconfig setting files"
DESCRIPTION = "This library can be used to parse setting files that follow a trivial \
'KEY=VALUE'-style pattern, similar to what can be found in files \
located in /etc/sysconfig. libdeflt supports values with spaces \
which are not quoted, and which therefore are not always compatible \
with sh."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libdeflt1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "a88a49f870cc6233f810d1fd13cf533fe8e6a9c7e93c2562ca4d7f5b4bde0a64ac06eb4c5af84ee426f2c29aeeed736767bde063581f21de296e496b28652657"

RPROVIDES:${PN} += "libdeflt.so.1.0()(64bit) \
libdeflt.so.1.0(SCHILY_1.0)(64bit) \
libdeflt.so.1.0(SCHILY_1.1)(64bit) \
libdeflt1_0 \
libdeflt1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
