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

RPM_NAME = "parkverbot-1.5-1.5.aarch64.rpm"
RPM_HASH = "b737beab8cf14a7524fc9ca40c1ec3381e210c74bce63fc19f9ea8fa2847dbce4d5bbcec20e8c18cb37394bdad543cf5614beda61f5a07f8c05fb250b411b29b"

RPROVIDES:${PN} += "parkverbot \
parkverbot(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libHX.so.32()(64bit) \
libc.so.6()(64bit)"

inherit rpm
