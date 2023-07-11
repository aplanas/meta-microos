SUMMARY = "Tcl Binding for the OpenSSL Library"
DESCRIPTION = "This Tcl extension provides a generic binding to OpenSSL, utilizing \
the Tcl_StackChannel API for Tcl 8.2 and higher. The sockets behave \
exactly the same as channels created using Tcl's built-in socket \
command with additional options for controlling the SSL session."
LICENSE = "BSD-3-Clause"

PV = "1.7.22"

RPM_NAME = "tls-1.7.22-2.7.aarch64.rpm"
RPM_HASH = "2664c0455713debecf72f36dc1dbf02491e976f5e054528b0c7692f5ef7baef3b96cef4365a692c2b484f294d10872726bf944b2b0eef692e46d7a5b4c32c22f"

RPROVIDES:${PN} += "tls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
