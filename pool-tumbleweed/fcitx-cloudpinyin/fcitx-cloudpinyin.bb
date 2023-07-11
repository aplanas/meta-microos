SUMMARY = "Cloudpinyin module for fcitx"
DESCRIPTION = "Cloulpinyin is an based cloud compute input method"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.7"

RPM_NAME = "fcitx-cloudpinyin-0.3.7-1.17.aarch64.rpm"
RPM_HASH = "0f8906c01ff6252a8826da5769197e9466085d03ca94a7337c3fba75c379607d8784dde8e1ab6871bc3028b4859b9c798a7eefa11b963d315f59d3fa34b72835"

RPROVIDES:${PN} += "fcitx-cloudpinyin \
locale-fcitx-zh-CN;zh-SG"

RDEPENDS:${PN} += "fcitx \
libc.so.6 \
libcurl.so.4"

inherit rpm
