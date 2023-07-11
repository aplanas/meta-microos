SUMMARY = "Development files for claws-mail"
DESCRIPTION = "Claws Mail (previously known as Sylpheed-Claws) is a \
configurable email client and news reader based on the GTK+ GUI \
toolkit, and it runs on the X Window System. \
 \
This package contains header files for building plugins."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-devel-4.1.1-2.6.aarch64.rpm"
RPM_HASH = "8edd312f27cf7211d13d24a910b6ea47509b83b5d537b2f521812e67952a763c62b4bacd5fe2b3394ca74271da58e66c430a17c6832fdd797421c270c0c9a5ae"

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
