SUMMARY = "Berkeley Logo interpreter"
DESCRIPTION = "Berkeley Logo interpreter is a free (both senses) interpreter for the Logo \
programming language."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.4"

RPM_NAME = "ucblogo-6.2.4-1.3.aarch64.rpm"
RPM_HASH = "dcc1a53f6d3e0d78bd0335dcf9011de2a334babc13f0d639b31be4699abb2746fea2c5c4739cfab37f32d9aeda8445c92259f20b54e8ad109d54af6b292df415"

RPROVIDES:${PN} += "ucblogo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0"

inherit rpm
