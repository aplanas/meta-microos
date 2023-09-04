SUMMARY = "Integrate Cairo into the Glib type system"
DESCRIPTION = "Integrate Cairo into the Glib type system"
LICENSE = "LGPL-2.1-or-later"

PV = "1.005"

RPM_NAME = "perl-Cairo-GObject-1.005-1.22.aarch64.rpm"
RPM_HASH = "85cf16002a832b2a24e75b7d549c2254e85f14751d06732f834d0c6098cc7e6c24923f87fb58048549b5a709795c08b98eb6c506fda989d3c498c3f9a78e8428"

RPROVIDES:${PN} += "perl-Cairo--GObject \
perl-Cairo--GObject--Install--Files \
perl-Cairo-GObject"

RDEPENDS:${PN} += "libcairo-gobject.so.2 \
libcairo.so.2 \
libglib-2.0.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-Cairo \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
