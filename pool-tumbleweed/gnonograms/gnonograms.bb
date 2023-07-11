SUMMARY = "Program for creating and solving gnonogram puzzles"
DESCRIPTION = "An implementation of the Japanese logic puzzle 'Nonograms'."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "gnonograms-2.0.0-1.8.aarch64.rpm"
RPM_HASH = "1eaa7bb4dfa4e8aac1d87ebab9bae30b7ba3c8f27811d7de9e81ddb8dfa3481d48aa7d2724f45353756cab27258f2f432b8477e5bbb3bd73575bc3e9186faf2e"

RPROVIDES:${PN} += "gnonograms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
