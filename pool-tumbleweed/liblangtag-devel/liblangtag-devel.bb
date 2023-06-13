SUMMARY = "Files for Developing with liblangtag"
DESCRIPTION = "liblangtag is an interface library to access tags for identifying \
languages. \
 \
This package contains the liblangtag development files."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.3"

RPM_NAME = "liblangtag-devel-0.6.3-2.7.aarch64.rpm"
RPM_HASH = "7bcdcae820b23dd3a4151831e7c775f42542ba224978affcd214a890be26ac2e6147f036825812374c518540e0c8c1cdccf317bb1b937cdf6d12e6d0b40cedb9"

RPROVIDES:${PN} += "liblangtag-devel \
liblangtag-devel(aarch-64) \
pkgconfig(liblangtag)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblangtag1 \
pkgconfig(glib-2.0) \
pkgconfig(libxml-2.0)"

inherit rpm
