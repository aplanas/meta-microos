SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.38"

RPM_NAME = "glibc-i18ndata-2.38-2.1.noarch.rpm"
RPM_HASH = "4bcd0f329091256b48d5c8abdc5c9aa4fe537a3f179adf2452474495f401d3c1cf9d20d0f35de192891f8aa702c604e01e15f3d1259c1b85d04913870e5c8ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"

RDEPENDS:${PN} += ""

inherit rpm
