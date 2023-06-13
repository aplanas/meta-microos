SUMMARY = "A statistical language model based Japanese input method engine"
DESCRIPTION = "SKK is a statistical language model based Japanese input method engine. \
to model the Japanese language, it use a backoff bigram and trigram \
 \
This package provides GObject-based library to deal with Japanese \
kana-to-kanji conversion method."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0+git20171110+1.0.3"

RPM_NAME = "libskk0-1.2.0+git20171110+1.0.3-2.8.aarch64.rpm"
RPM_HASH = "be4cae1af9435efed94e2942c9ddd665a9444ceb9ff23658077cf464284446a4028d9eb05b8c9ed5e0af011c1c28097a8488b32b4365e70b64b1851a25dbcd4d"

RPROVIDES:${PN} += "libskk.so.0()(64bit) \
libskk0 \
libskk0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
skkdic \
skkdic-extra"

inherit rpm
