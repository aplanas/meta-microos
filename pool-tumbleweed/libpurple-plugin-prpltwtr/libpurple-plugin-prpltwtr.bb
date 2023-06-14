SUMMARY = "Libpurple/Pidgin plugin supporting microblogging"
DESCRIPTION = "This is a libpurple Pidgin, Finch, etc plugin which treats \
microblogging sites GNU social, Twitter as IM protocols."
LICENSE = "GPL-2.0+"

PV = "0.14.0"

RPM_NAME = "libpurple-plugin-prpltwtr-0.14.0-1.27.aarch64.rpm"
RPM_HASH = "3581b8df83685d48ac27117aee40a5a1e814ef5e9d4864208875b2388d2428a43f8d0ae9967d80ef1c7a026bb82715ec9e826c7b86d932e425aad355f91c8304"

RPROVIDES:${PN} += "libprpltwtr-statusnet.so \
libprpltwtr-twitter.so \
libprpltwtr.so \
libpurple-plugin-prpltwtr \
pidgin-prpltwtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpurple.so.0"

inherit rpm
