SUMMARY = "Program for creating and solving gnonogram puzzles"
DESCRIPTION = "An implementation of the Japanese logic puzzle 'Nonograms'."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "gnonograms-2.0.0-1.7.aarch64.rpm"
RPM_HASH = "ff4ec423a9bac3dbdef8512a4c8d99376f9b42d6669a9a67b259cb366f6448c38952c62f89984ac058d10e7273ad9e2512e91d4721d91b673399f0ade36a3aa7"

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
