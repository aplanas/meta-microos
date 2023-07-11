SUMMARY = "Video player with plugins"
DESCRIPTION = "xine is a free multimedia player. It plays back CDs, DVDs, and VCDs. It \
also decodes multimedia files like AVI, MOV, WMV, and MP3 from local \
disk drives, and displays multimedia streamed over the Internet. It \
interprets many of the most common multimedia formats available - and \
some of the most uncommon formats, too. \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.99.14"

RPM_NAME = "xine-ui-0.99.14-1.4.aarch64.rpm"
RPM_HASH = "10e854606ebaf9e97237cb60dcfcc8cadb093e29a828f862e7b1a8fa2f7e0bce2e989df28ced0501685c55162c28ed2f96993ea5772cf7c46644bd62c315517d"

RPROVIDES:${PN} += "xine-/usr/bin/xine \
xine-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXss.so.1 \
libXtst.so.6 \
libXv.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libcurl.so.4 \
libjpeg.so.8 \
liblirc-client.so.0 \
libm.so.6 \
libpng16.so.16 \
libreadline.so.8 \
libxine.so.2"

inherit rpm
