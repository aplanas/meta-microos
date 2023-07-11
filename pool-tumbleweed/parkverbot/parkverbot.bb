SUMMARY = "Daemon to prevent hard disk head parking in rotational media"
DESCRIPTION = "Modern rotational hard disks have a misfeature involving the regular \
automatic unloading of the heads, measurable by the SMART attribute \
'Load_Cycle_Count', that causes latency on wake-up, and while the \
manufacturers sell this as 'green', it is believed to cause reduced \
hard disk life. \
 \
The parkverbot daemon will periodically issue small read requests in \
order to keep the hardware from going to its head-unloaded idle \
state."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "parkverbot-1.5-1.6.aarch64.rpm"
RPM_HASH = "495926dac638335c6a5a9822ac273fecd3915b0da8f63f511387946870b61fac9c65c4d7d9e33ab6e2889b681cf1fa127df217015511bc37d661ddd65251aed2"

RPROVIDES:${PN} += "parkverbot"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6"

inherit rpm
