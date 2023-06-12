SUMMARY = "Client interface library for tpm2-abrmd"
DESCRIPTION = "This library allows to interact with the tpm2-abrmd daemon. It is intended for \
use with the SAPI library (libtss2-sys) like any other TCTI."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "libtss2-tcti-tabrmd0-3.0.0-2.1.aarch64.rpm"
RPM_HASH = "7bd650680edc6b3351457a9b18a585bed759dad7da473487b216e602c48bb658f8a248ce2e5d214bdd387f38c5ccc1b54342f7fc78824d5b03e853dd441679a3"

RPROVIDES:${PN} += "libtss2-tcti-tabrmd.so.0()(64bit) \
libtss2-tcti-tabrmd0 \
libtss2-tcti-tabrmd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-rc.so.0()(64bit) \
libtss2-sys.so.1()(64bit) \
libtss2-tctildr.so.0()(64bit)"

inherit rpm
