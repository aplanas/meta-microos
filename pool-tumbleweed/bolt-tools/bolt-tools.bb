SUMMARY = "Bolt Tools"
DESCRIPTION = "The bolt-tools package contains optional tools from the Bolt \
software framework."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "bolt-tools-0.9.5-1.4.aarch64.rpm"
RPM_HASH = "ddaa4b73bb8f1d4649274faf608cff1ac5aa6205017829471c6ca2ee2d0107d7ebdeefe629c7bf8ddd143196fdc957f96ec4160551e5a3c37de3667ccc22f2aa"

RPROVIDES:${PN} += "bolt-tools"

RDEPENDS:${PN} += "bolt \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
