SUMMARY = "Mono bindings for gio"
DESCRIPTION = "This package contains Mono bindings for gio-sharp."
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "gio-sharp3-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "c78004be502caaa38e8c6c097192679470f7575b5d82c8707da57d5a8852510863b53fcf1807132e8829e7b8c9d46611c5b955857ea7a7e407b9f422012e3802"

RPROVIDES:${PN} += "gio-sharp3 \
mono-gio-sharp"

RDEPENDS:${PN} += "mono-System \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
