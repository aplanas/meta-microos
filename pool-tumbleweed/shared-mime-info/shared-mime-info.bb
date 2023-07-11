SUMMARY = "Shared MIME Database"
DESCRIPTION = "This package contains: \
 \
- The freedesktop.org shared MIME database spec. \
 \
- The merged GNOME and KDE databases, in the new format. \
 \
- The update-mime-database command, used to install new MIME data."
LICENSE = "GPL-2.0-or-later"

PV = "2.2"

RPM_NAME = "shared-mime-info-2.2-2.2.aarch64.rpm"
RPM_HASH = "119dc6b80fa15a1667fca8eb6ebf528e74e08ba9635258678d03c0b912d53896a569dcab5d125910408b217d12fc27b89e46406a1ae7e9da464ab3b9bfd09b51"

RPROVIDES:${PN} += "pkgconfig-shared-mime-info \
rpm-macro-mime-database-post \
rpm-macro-mime-database-postun \
shared-mime-info \
shared-mime-info-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libxml2.so.2"

inherit rpm
