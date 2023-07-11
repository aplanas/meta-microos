SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-locale-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "c551d5f5e28e517ce9ae0021af0c7c34e83cc1afcc9ad2a56720c4b6a6e895c017102522fc217c7e6ec9f34af41ae6d9c6274a2e65e7082b70252e0824767de5"

RPROVIDES:${PN} += "libstdc++6-gcc7-locale \
libstdc++6-locale \
locale-libstdc++6-gcc7-de \
locale-libstdc++6-gcc7-fr"

RDEPENDS:${PN} += ""

inherit rpm
