SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreofficekit-devel-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "a3b924276f4043f694cacaa0d404384aa2220ea9586064bd51509dfa7ce78036d2d0a21e8874bde51b9d93ae02d154bc1c22d6802da5ec46ad34192b0513ac1d"

RPROVIDES:${PN} += "libreofficekit-devel"

RDEPENDS:${PN} += "libreofficekit"

inherit rpm
