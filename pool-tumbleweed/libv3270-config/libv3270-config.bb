SUMMARY = "Configuration files for the 3270 Virtual Terminal library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this package provides the configuration files required to libv3270."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "libv3270-config-5.4-1.10.noarch.rpm"
RPM_HASH = "015d05a4e7107604367444bbaffd62cbf9d4b93d216f3cd31dbfd1b9775c388758c60d50623908393365713ea4be7eb5176b58cfd4e262ae15e67282e30c445c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libv3270-config \
libv3270-config"

RDEPENDS:${PN} += "libv3270-5-4"

inherit rpm
