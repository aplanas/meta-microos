SUMMARY = "Threaded Newsreader"
DESCRIPTION = "slrn is a threaded Internet newsreader. It is customizable, \
permitting redefinition of keys and it includes a sophisticated macro \
language for further customization."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "slrn-1.0.3-3.18.aarch64.rpm"
RPM_HASH = "1019353aa699767a4e7649b19cba6e317bfd76967ee5551479a66fb3dc0077718d79d373a327e7c29c738a95cbac8cd23d364567d6fa330c2376dbf96bbef421"

RPROVIDES:${PN} += "config-slrn \
slrn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libslang.so.2 \
libssl.so.3"

inherit rpm
