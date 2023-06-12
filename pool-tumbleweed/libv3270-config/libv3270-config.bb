SUMMARY = "Configuration files for the 3270 Virtual Terminal library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this package provides the configuration files required to libv3270."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "libv3270-config-5.4-1.9.noarch.rpm"
RPM_HASH = "bf3acc8564c4bb5236f307ceed0528bf0a75fa531ee659555e3f70e2a73b7781aa9e3875d763d987abd5d4bfd4aefee84a53b0ae57f29b1ac75b4cdd875f6d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libv3270-config) \
libv3270-config"
RDEPENDS:${PN} += "libv3270-5_4"

inherit rpm
