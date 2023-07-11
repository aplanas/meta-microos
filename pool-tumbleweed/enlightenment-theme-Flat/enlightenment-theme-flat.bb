SUMMARY = "Default Enlightenment theme(Flat)"
DESCRIPTION = "The default theme for enlightenment install when using openSUSE branding."
LICENSE = "BSD-2-Clause & LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-theme-Flat-0.21.0-30.8.aarch64.rpm"
RPM_HASH = "affe66f56c29eac058d4a3fee5e12b880f2cf9c484ee51261d8b3d885205b7f72769fe5f74d14df9ba387f03b818160a8a8a235126e18b495ff46f64e5479b95"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-Flat"

RDEPENDS:${PN} += ""

inherit rpm
