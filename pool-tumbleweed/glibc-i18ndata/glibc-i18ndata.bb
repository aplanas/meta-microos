SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.37"

RPM_NAME = "glibc-i18ndata-2.37-5.1.noarch.rpm"
RPM_HASH = "b1584adbde1dfbe7dbf7f95c237d3a7983d93647a2456a6cc90e94ddae49da75759200a0cfc920c23927bdebb718bf4a7af8e533aeba3abdc45c0dbed67ed7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"

RDEPENDS:${PN} += ""

inherit rpm
