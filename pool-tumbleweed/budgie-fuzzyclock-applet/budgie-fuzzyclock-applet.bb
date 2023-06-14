SUMMARY = "Fuzzyclock Applet"
DESCRIPTION = "This applet shows the time in a Fuzzy Way."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-fuzzyclock-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "0e400e93fdad9d76086e1cd866b7e78c140fff35d0a136ea984eb020c7a31b379f6137fcd0f338d50c7ac7c0252a4392eb4bcbbc12da435c581e052b7b161e1a"

RPROVIDES:${PN} += "budgie-fuzzyclock-applet \
libfuzzyclock.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
