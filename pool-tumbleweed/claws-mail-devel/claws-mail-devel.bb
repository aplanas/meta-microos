SUMMARY = "Development files for claws-mail"
DESCRIPTION = "Claws Mail (previously known as Sylpheed-Claws) is a \
configurable email client and news reader based on the GTK+ GUI \
toolkit, and it runs on the X Window System. \
 \
This package contains header files for building plugins."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-devel-4.1.1-2.7.aarch64.rpm"
RPM_HASH = "d1c90e1dccf9f1958188a1a7aedec87b3b44fe287a744d2dfcd778170b8b19114e637420cee722fb432468f4d2082d2ae582b03ae4ed4779a6c92af1e7e829d4"

RPROVIDES:${PN} += "claws-mail-/usr/include/claws-mail/main.h \
claws-mail-devel \
claws-mail-extra-plugins-devel \
pkgconfig-claws-mail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
claws-mail \
enchant-devel \
glib2-devel \
gnutls-devel \
gpgme-devel \
gtk3-devel \
libcanberra-gtk3-devel \
libetpan-devel \
openldap2-devel"

inherit rpm
