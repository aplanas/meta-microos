SUMMARY = "Text-based addressbook program"
DESCRIPTION = "Abook is a text-based addressbook program designed to \
use with mutt mail client."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "abook-0.6.1-3.13.aarch64.rpm"
RPM_HASH = "8124f3d8f12a8cd65a353c3d7c7796e7aef70efc173a72d13b3efeb957e501f89b432c106f12dac01419e8eca53c829042c653127d85d2ee0337facc0bd74cd3"

RPROVIDES:${PN} += "abook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
