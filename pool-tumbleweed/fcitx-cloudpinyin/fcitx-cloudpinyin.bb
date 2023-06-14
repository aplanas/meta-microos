SUMMARY = "Cloudpinyin module for fcitx"
DESCRIPTION = "Cloulpinyin is an based cloud compute input method"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.7"

RPM_NAME = "fcitx-cloudpinyin-0.3.7-1.16.aarch64.rpm"
RPM_HASH = "6135360caa74966f7f5ccc0fc6e5d1a6ff6c72809ca00c8e900e15d76d6d8ec2572160711b63c3be40bb93f909fe18fdaf1f57b3327ee1b5ccc9366a2b95ee69"

RPROVIDES:${PN} += "fcitx-cloudpinyin \
locale-fcitx-zh-CN;zh-SG"

RDEPENDS:${PN} += "fcitx \
libc.so.6 \
libcurl.so.4"

inherit rpm
