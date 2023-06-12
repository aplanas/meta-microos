SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.37"

RPM_NAME = "glibc-i18ndata-2.37-4.1.noarch.rpm"
RPM_HASH = "f811db30574faa198e05386c87877969bf52ba256e31952f938e0bbc22939b0546828078698a0ffb8c490b86cb04667cada0304db510fee34be967a93c562be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"
RDEPENDS:${PN} += ""

inherit rpm
