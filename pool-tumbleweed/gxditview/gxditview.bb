SUMMARY = "Ditroff Output Displayer for Groff"
DESCRIPTION = "This version of xditview is called gxditview and has some extensions \
used by the groff command.  gxditview is used by groff if called with \
the -X option."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "gxditview-1.22.4-10.5.aarch64.rpm"
RPM_HASH = "0879bc48adcc6ba11523d5bf9a02dcfdac21466a7cc3d1ffde815785e60fbe7fb14e66b634baa6e60d5b9d38805e54c33e792cdc4611300342c119fcf9a240b7"

RPROVIDES:${PN} += "gxditview \
gxdview"

RDEPENDS:${PN} += "groff-full \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
