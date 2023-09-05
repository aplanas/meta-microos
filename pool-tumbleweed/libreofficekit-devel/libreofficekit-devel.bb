SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreofficekit-devel-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "5cbc014306850b39e02878d10352072ad4c8fd869498dc3fa10cdfb75830fb16eafbc4711b228762c8cb114dff579007510be849a01b87c777f394a19044508c"

RPROVIDES:${PN} += "libreofficekit-devel"

RDEPENDS:${PN} += "libreofficekit"

inherit rpm
