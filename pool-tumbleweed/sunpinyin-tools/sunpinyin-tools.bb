SUMMARY = "Dictionary tools for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides dictionary tools needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-tools-2.0.99.2-2.3.aarch64.rpm"
RPM_HASH = "253d65757e8daa87e2620df8a830ac19cb4a4347b09f82cab05605a45cca08cb6a199d788e7622d43253d1283a73d0e01d7b495471af3925f6d5b0f3af1f94a3"

RPROVIDES:${PN} += "sunpinyin-tools"

RDEPENDS:${PN} += "/usr/bin/make \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
