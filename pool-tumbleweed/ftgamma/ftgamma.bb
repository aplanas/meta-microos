SUMMARY = "Screen gamma calibration helper"
DESCRIPTION = "Screen gamma calibration helper \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftgamma-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "2d2ce14b157d231b67b306a5569d9ef575740e18f6dd230048a826f504f067734a817ec0d880c085345d4ff9f731786850a21841742ef5e2fd584b33aab5f18a"

RPROVIDES:${PN} += "ftgamma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
