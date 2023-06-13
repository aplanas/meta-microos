SUMMARY = "Development libraries and headers for libgme"
DESCRIPTION = "The developmental files that must be installed in order to compile applications \
which use libgme."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.3"

RPM_NAME = "libgme-devel-0.6.3-2.4.aarch64.rpm"
RPM_HASH = "c1928c84e53e1897df707cadb82c9aab3e89a6dfee6429b4869aef715a84e6527eef6013962e3b438133c2510fbc7482409324a7787c7deddaf7b91ed7796ddf"

RPROVIDES:${PN} += "libgme-devel \
libgme-devel(aarch-64) \
pkgconfig(libgme)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgme0"

inherit rpm
