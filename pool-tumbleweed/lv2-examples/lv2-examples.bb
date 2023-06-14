SUMMARY = "LV2 example plugins"
DESCRIPTION = "LV2 is a plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a core (roughly \
equivalent in power to LADSPA) which can be extended to support more \
functionality. \
This package contains LV2 example plugins."
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-examples-1.18.10-2.1.aarch64.rpm"
RPM_HASH = "0ae41983e2dfe2bea7f5dcf9315140486f245fd93ee322689ceca8114f4e84dce2e27372e7becadb1813d2192d550f405428cc0f63f65b49c5b159f864d78749"

RPROVIDES:${PN} += "lv2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
lv2"

inherit rpm
