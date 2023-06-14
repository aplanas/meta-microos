SUMMARY = "Icecast/Shoutcast Stream Grabber"
DESCRIPTION = "fIcy is a command line icecast/shoutcast stream grabber. It will work \
with any ICY-compatible stream and allows to either save the stream to \
user-customizable files or pipe the output to a media player, or both."
LICENSE = "LGPL-2.1+"

PV = "1.0.21"

RPM_NAME = "fIcy-1.0.21-1.20.aarch64.rpm"
RPM_HASH = "9ca9d59ed2a39b5046367e520b4d53a1f7c1befdace01d97bc6324dd16a707433cd9e2476ec1fb7d1c488c4b5cac4a7fa923985f65961e99ff87f6ade6e6f55c"

RPROVIDES:${PN} += "fIcy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
