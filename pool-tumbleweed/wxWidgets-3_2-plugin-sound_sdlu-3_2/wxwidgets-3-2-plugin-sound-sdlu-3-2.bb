SUMMARY = "wxWidgets SDL Plugin"
DESCRIPTION = "SDL based sound plugin for the wxWidgets cross-platform GUI."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-plugin-sound_sdlu-3_2-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "f4de50c8a45186b19d5570ba3048f249e7e93af5e9626d51d06ea80cc025680e681055eb00a8959b41140fc8fbf35bd17efa2492fb2545827d6a9972c004cfbc"

RPROVIDES:${PN} += "wxWidgets-3-2-plugin-sound-sdlu-3-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
