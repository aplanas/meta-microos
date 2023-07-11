SUMMARY = "Text-based addressbook program"
DESCRIPTION = "Abook is a text-based addressbook program designed to \
use with mutt mail client."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "abook-0.6.1-3.14.aarch64.rpm"
RPM_HASH = "56991891a6757a5ec967694b7b5018aca34b4894b4bcacf2b948cb997d8bb7f93aefc60a2ef5366d8b32df37b60055693f0c5bcfacfe39475e94ff77d8d1670c"

RPROVIDES:${PN} += "abook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
