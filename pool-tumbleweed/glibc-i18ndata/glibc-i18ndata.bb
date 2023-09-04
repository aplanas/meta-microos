SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.38"

RPM_NAME = "glibc-i18ndata-2.38-1.1.noarch.rpm"
RPM_HASH = "ea01debb4435eac7708aea0df498c6e50fec9d408958c15b22564c2c60a47bee7c90a2e47965acc87911cff16729bcdc2161d97474f5e9b939d5a93543683812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"

RDEPENDS:${PN} += ""

inherit rpm
