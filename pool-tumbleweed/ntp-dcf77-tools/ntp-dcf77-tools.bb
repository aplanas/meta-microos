SUMMARY = "DCF77 related tools"
DESCRIPTION = "DCF77 related programs. \
 \
There are currently two tools: \
  * testdcf, a simple DCF77 raw impulse test program. \
  * dcfd, a simple DCF77 raw impulse receiver with NTP loopfilter \
    mechanics for synchronisation."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p17"

RPM_NAME = "ntp-dcf77-tools-4.2.8p17-1.1.aarch64.rpm"
RPM_HASH = "3060566bc039029acfe0d61e3c7d17de5a42141482be923c1a464ca335cef6044c876775131d712ad1ce83e20b4943549e971975cf3b79bc7eb55eb3028aa4aa"

RPROVIDES:${PN} += "ntp-dcf77-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
