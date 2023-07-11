SUMMARY = "Integrate Cairo into the Glib type system"
DESCRIPTION = "Integrate Cairo into the Glib type system"
LICENSE = "LGPL-2.1-or-later"

PV = "1.005"

RPM_NAME = "perl-Cairo-GObject-1.005-1.21.aarch64.rpm"
RPM_HASH = "e531bf247832fc1ea45fe62b69a08b5757d646098e795b844125960a7c76557411190248f903a3fe78d064ddcb96402ed3e04d690c16829fbf1b68c43bfad008"

RPROVIDES:${PN} += "perl-Cairo--GObject \
perl-Cairo--GObject--Install--Files \
perl-Cairo-GObject"

RDEPENDS:${PN} += "libcairo-gobject.so.2 \
libcairo.so.2 \
libglib-2.0.so.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-Cairo \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
