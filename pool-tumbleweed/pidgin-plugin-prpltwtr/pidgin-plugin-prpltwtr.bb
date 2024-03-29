SUMMARY = "Libpurple/Pidgin plugin supporting microblogging"
DESCRIPTION = "This is a Pidgin plugin which treats microblogging sites \
GNU social, Twitter as IM protocols."
LICENSE = "GPL-2.0+"

PV = "0.14.0"

RPM_NAME = "pidgin-plugin-prpltwtr-0.14.0-1.27.aarch64.rpm"
RPM_HASH = "0acdd8241dd37e8befffca5ab537e4b5a24cbe5f0c6d5677d09159d0ee29afc716cbbf061382259883ccbf87f8796cbc2cd22613a0b5ae6cfd60c43ba3f534ca"

RPROVIDES:${PN} += "libgtkprpltwtr.so \
pidgin-plugin-prpltwtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libprpltwtr.so \
libpurple-plugin-prpltwtr \
libpurple.so.0 \
pidgin"

inherit rpm
