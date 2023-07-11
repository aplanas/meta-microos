SUMMARY = "Extension of iconv for libapache-mod-encoding"
DESCRIPTION = "This code is an iconv-compatible interface routine for mod_encoding."
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "libiconv_hook1-0.0.20021209-1.28.aarch64.rpm"
RPM_HASH = "5a5abfcba088da962d6cdc8a25db2d7b3613cdf30f9f6d0a218ee47aef88cc593f669ee676c0bbb664b90b8aab16cdd652511ac36e87e818f4c59ea0c0c960fd"

RPROVIDES:${PN} += "libiconv-hook.so.1 \
libiconv-hook1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
