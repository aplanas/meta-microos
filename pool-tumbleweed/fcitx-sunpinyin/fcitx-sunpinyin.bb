SUMMARY = "Sunpinyin module for fcitx"
DESCRIPTION = "SunPinyin \
=== \
 \
SunPinyin is an SLM (Statistical Language Model) based input method \
engine. To model the Chinese language, it use a backoff bigram and \
trigram language model. \
 \
Currently, SunPinyin 2.0 is available on IBus. \
 \
fcitx-sunpinyin \
=== \
 \
fcitx-sunpinyin is a wrapper around SunPinyin which enables user to use \
SunPinyin with fcitx."
LICENSE = "GPL-2.0+"

PV = "0.4.2"

RPM_NAME = "fcitx-sunpinyin-0.4.2-1.27.aarch64.rpm"
RPM_HASH = "4c4b3d83da17c12e5861d1965b448f658ae84ac197804914d57010e1a254ec23be40d4176fe60b68e21129201428f813cb1c967ada88e53cf2dafe226947085d"

RPROVIDES:${PN} += "fcitx-sunpinyin \
locale-fcitx-zh-CN;zh-SG"

RDEPENDS:${PN} += "fcitx \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsunpinyin.so.3"

inherit rpm
