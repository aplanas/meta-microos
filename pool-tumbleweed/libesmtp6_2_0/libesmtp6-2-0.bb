SUMMARY = "A Library for Posting Electronic Mail"
DESCRIPTION = "libESMTP is a library to manage posting (or submission of) electronic \
mail using SMTP to a preconfigured Mail Transport Agent (MTA). It may \
be used as part of a Mail User Agent (MUA) or another program that \
must be able to post electronic mail but where mail functionality is \
not that program's primary purpose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libesmtp6_2_0-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "5c6fc330300d1ab8e55f28eb05193a337bed926b13b47c023b0c353a49b7160ebf11b4d2df9224681b20921fa052d2d0f87b6ab35a1158c34a674448e397da2c"

RPROVIDES:${PN} += "libesmtp.so.6.2.0 \
libesmtp6-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
