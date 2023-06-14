SUMMARY = "Dictionary tools for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides dictionary tools needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-tools-2.0.99.2-2.2.aarch64.rpm"
RPM_HASH = "04231630da4c08d65d166c9c25e49a4a3201dd5226e76f5b64654f56b2186d2a079c46c1143feaf6408c70db12d8079303cd8920acc4c881e0e6d4123a1d496f"

RPROVIDES:${PN} += "sunpinyin-tools"

RDEPENDS:${PN} += "/usr/bin/make \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
