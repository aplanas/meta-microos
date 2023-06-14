SUMMARY = "Libraries for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "libsunpinyin3-2.0.99.2-2.2.aarch64.rpm"
RPM_HASH = "520176d5a3c603e534f8ac6cd24a0e977bee29eebf1c9a0a587316aca6a821979a875215562834aa75fccd153f344eafa00a85b6f7e508d9ab5327f660fb157d"

RPROVIDES:${PN} += "libsunpinyin.so.3 \
libsunpinyin3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
sunpinyin-data"

inherit rpm
