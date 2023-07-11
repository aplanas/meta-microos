SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "51a563be67a46542307392423df76c57b883072350b93b7de418753929160118f3522c7795ffa72f206acc8618d6836a838d837f63a52810b7e0ea0ddf95bc03"

RPROVIDES:${PN} += "PackageKit \
libpk-backend-dummy.so"

RDEPENDS:${PN} += "/usr/bin/sh \
PackageKit-backend \
PackageKit-branding \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekit-glib2.so.18 \
libpolkit-gobject-1.so.0 \
libsqlite3.so.0 \
libsystemd.so.0"

inherit rpm
