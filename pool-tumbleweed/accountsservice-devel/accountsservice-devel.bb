SUMMARY = "Header files for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-devel-23.13.9-3.1.aarch64.rpm"
RPM_HASH = "53797409f008607161321a8bf158746cbbe5c08c9946d25029a9808aa68604ef05525afcfff9e987bc09b9cabf095b58292593ac88cbad5b6dc02b3896033062"

RPROVIDES:${PN} += "accountsservice-devel \
pkgconfig-accountsservice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccountsservice0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-polkit-gobject-1 \
typelib-1-0-AccountsService-1-0"

inherit rpm
