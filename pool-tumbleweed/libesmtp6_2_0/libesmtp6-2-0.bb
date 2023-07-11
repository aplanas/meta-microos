SUMMARY = "A Library for Posting Electronic Mail"
DESCRIPTION = "libESMTP is a library to manage posting (or submission of) electronic \
mail using SMTP to a preconfigured Mail Transport Agent (MTA). It may \
be used as part of a Mail User Agent (MUA) or another program that \
must be able to post electronic mail but where mail functionality is \
not that program's primary purpose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libesmtp6_2_0-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "e51b2b97f80be54e8ad76bc8507e51125c5f42bb0e49a95b944ba665c822c5887e592b4ab3d4aea79b495c7fb8e2df83256d2d8b12891fdc4014faad07eb02db"

RPROVIDES:${PN} += "libesmtp.so.6.2.0 \
libesmtp6-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
