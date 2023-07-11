SUMMARY = "Library for HTTP normalizer and parser"
DESCRIPTION = "The HTP Library is an HTTP normalizer and parser written by Ivan Ristic of Mod Security fame for the OISF. This integrates and provides very advanced processing of HTTP streams for Suricata. The HTP library is required by the engine, but may also be used independently in a range of applications and tools."
LICENSE = "BSD-3-Clause"

PV = "0.5.44"

RPM_NAME = "libhtp2-0.5.44-1.1.aarch64.rpm"
RPM_HASH = "b80852354aa4ce82738f7fd46eb3c02891517db978854972ebad54c95c085e61ff2e298d18938f8975039ea55e533d5d0723987ffa22e0161485a3441045d15e"

RPROVIDES:${PN} += "libhtp.so.2 \
libhtp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
