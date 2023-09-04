SUMMARY = "IDE for The Coq Proof Assistant"
DESCRIPTION = "The Coq Integrated Development Interface is a graphical interface for the Coq proof assistant."
LICENSE = "LGPL-2.1-only"

PV = "8.17.1"

RPM_NAME = "coq-ide-8.17.1-1.2.aarch64.rpm"
RPM_HASH = "7c0f930e2cad5a48830bfe9dd986e8855558d8b8837ab238cbe5008df24b15a45c144931f717750755fcf102ec36bfb897174987d9e1f4dc7726010cd5305ecb"

RPROVIDES:${PN} += "coq-ide"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
coq \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
