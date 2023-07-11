SUMMARY = "Sunpinyin module for scim"
DESCRIPTION = "SunPinyin \
=== \
 \
SunPinyin is an SLM (Statistical Language Model) based input method \
engine. To model the Chinese language, it use a backoff bigram and \
trigram language model. \
 \
Currently, SunPinyin 2.0 is available on IBus. \
 \
scim-sunpinyin \
=== \
 \
scim-sunpinyin is a wrapper around SunPinyin which enables user to use \
SunPinyin with scim framework."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "2.0.3"

RPM_NAME = "scim-sunpinyin-2.0.3-11.4.aarch64.rpm"
RPM_HASH = "c1c72db3685e5c95a303a1179ce7045d40e86bdd3ecbee63fb604ecd3dda28fa66d679bb4213cb6f56a81d104d179504ef903a16939a728050b098dfa62b26b0"

RPROVIDES:${PN} += "scim-sunpinyin"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6 \
libsunpinyin.so.3"

inherit rpm
