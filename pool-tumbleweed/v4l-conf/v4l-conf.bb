SUMMARY = "Video4linux Configuration Tool"
DESCRIPTION = "This is a small utility used to configure video4linux device drivers \
(bttv, for example). xawtv, motv, and fbtv need it."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "v4l-conf-3.107-2.11.aarch64.rpm"
RPM_HASH = "b628438df4eea401ce27f90cb9363a740896086fa923b11d2944cf399c1121b0b8876fffc58a56e65946e922cce4e98bc0934e5b9c7fc8af74fe78630d0d81bc"

RPROVIDES:${PN} += "v4l-conf \
xawtv-/usr/bin/v4l-conf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
libc.so.6 \
permissions"

inherit rpm
