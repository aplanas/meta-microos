SUMMARY = "Client interface library for tpm2-abrmd"
DESCRIPTION = "This library allows to interact with the tpm2-abrmd daemon. It is intended for \
use with the SAPI library (libtss2-sys) like any other TCTI."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "libtss2-tcti-tabrmd0-3.0.0-2.2.aarch64.rpm"
RPM_HASH = "6cb91716fee4f9aa52dc3247cbf08ffadc66a3b4d6aae623356c3297833a3ce57088a4a01bf822699a09b5ecab222705e6644908ec049a85cd216ec1152e1a79"

RPROVIDES:${PN} += "libtss2-tcti-tabrmd.so.0 \
libtss2-tcti-tabrmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-sys.so.1 \
libtss2-tctildr.so.0"

inherit rpm
