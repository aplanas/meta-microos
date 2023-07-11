SUMMARY = "Icecast/Shoutcast Stream Grabber"
DESCRIPTION = "fIcy is a command line icecast/shoutcast stream grabber. It will work \
with any ICY-compatible stream and allows to either save the stream to \
user-customizable files or pipe the output to a media player, or both."
LICENSE = "LGPL-2.1+"

PV = "1.0.21"

RPM_NAME = "fIcy-1.0.21-1.21.aarch64.rpm"
RPM_HASH = "ef245bee03b08cf46fed14a57e3ff3eff23a6e547de4c08dd45e13b1761f46fa8362a6801614aa4d849c99435f8cc479762243a7755659d8d5374f5138ea6612"

RPROVIDES:${PN} += "fIcy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
