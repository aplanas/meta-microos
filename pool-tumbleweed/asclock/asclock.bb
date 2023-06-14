SUMMARY = "AfterStep digital clock"
DESCRIPTION = "A swallowable applet shows clock and calendar. Supports themes for \
different looks."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.12"

RPM_NAME = "asclock-2.0.12-312.11.aarch64.rpm"
RPM_HASH = "d81802101fc66684ed320e381423970e1edb1ff983eeb0073d8c7fba26e09d19d328b6e0baca7f7e7f9eff1fd7731e015505cdceb087abd85e6aaabc1dd93265"

RPROVIDES:${PN} += "asclock \
astools-/usr/X11R6/bin/asclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6"

inherit rpm
