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

RPM_NAME = "scim-sunpinyin-2.0.3-11.3.aarch64.rpm"
RPM_HASH = "ef40e5b3bed117dc167cb2f761e35a2fb751180107e8717c3f8b519c550649513fac264389cdb5fb07013c0ee4d72f1c0f285949f1b41f12839cf8ffab1e34dd"

RPROVIDES:${PN} += "scim-sunpinyin"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6 \
libsunpinyin.so.3"

inherit rpm
