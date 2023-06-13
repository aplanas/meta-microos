SUMMARY = "Group Update Program for INN and C-News"
DESCRIPTION = "A Group Update Program that accepts commands by mail to edit a \
newsgroup subscription file.  It can be used by news systems such as \
INN and C-News."
LICENSE = "SUSE-Public-Domain"

PV = "0.3"

RPM_NAME = "gup-0.3-1010.10.aarch64.rpm"
RPM_HASH = "ebbc280772f77ad65959029ba08d976543c035795f089aa869198678216b7f1284ac1f41be1bb4a7b350917c1aff99b9433d05eb83e915c730b8c71d27abe488"

RPROVIDES:${PN} += "config(gup) \
gup \
gup(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(news) \
inn \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
user(news)"

inherit rpm
