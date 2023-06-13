SUMMARY = "A distributed C/C++ compiler"
DESCRIPTION = "distcc is a program to distribute builds of C, C++, Objective C or \
Objective C++ code across several machines on a network, thereby \
completing the task in less time. distcc should always generate the \
same results as a local build."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-3.4-5.4.aarch64.rpm"
RPM_HASH = "da1a7389976739e19b23a76f1c1db2765fa2a0b78036dabbcc54007a654b4d3bc513cc61daf682fb1f4a8f19a20bc3ae8711fd156290d9c08e3dd3fe58361c99"

RPROVIDES:${PN} += "config(distcc) \
distcc \
distcc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit)"

inherit rpm
