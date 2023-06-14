SUMMARY = "Spell checker library and tool based on HFST"
DESCRIPTION = "Minimal HFST optimized lookup format based spell checker library and \
a demonstrational implementation of command line based spell checker."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "hfst-ospell-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "e1c6a386e904eb4538afb28743c4d01bfb9df31da976d9c97eaf649d11d2edf5b6ba93b9110fe14666a3536e551b0902db6608ce277e20f532a6066edf963dbe"

RPROVIDES:${PN} += "hfst-ospell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhfstospell.so.11 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
