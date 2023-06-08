SUMMARY = "Development files for claws-mail"
DESCRIPTION = "Claws Mail (previously known as Sylpheed-Claws) is a \
configurable email client and news reader based on the GTK+ GUI \
toolkit, and it runs on the X Window System. \
 \
This package contains header files for building plugins."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-devel-4.1.1-2.3.aarch64.rpm"
RPM_HASH = "822448cc0d94eb7f5557eee232a62dc3dee4c055c260c4a25f13a4852b88eb3d00f9aee7fee05cc5b492b16842b99eba9aebd1a27980d135666783d72825fa03"

RPROVIDES:${PN} += "claws-mail-devel claws-mail-devel(aarch-64) claws-mail-extra-plugins-devel claws-mail:/usr/include/claws-mail/main.h pkgconfig(claws-mail)"
RDEPENDS:${PN} += "/usr/bin/pkg-config claws-mail enchant-devel glib2-devel gnutls-devel gpgme-devel gtk3-devel libcanberra-gtk3-devel libetpan-devel openldap2-devel"

inherit rpm
