SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "5f7abde0d851e2f57295326d6d46768295b072c6f4f11aa18a6dcd54f67afd229481e08d45b9438fbee6e475c982c109cf4b5d21c483f8a73cbce1052d61768d"

RPROVIDES:${PN} += "PackageKit \
libpk-backend-dummy.so"

RDEPENDS:${PN} += "/bin/sh \
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
