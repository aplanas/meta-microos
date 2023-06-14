SUMMARY = "Libyui - Header files for the NCurses REST API plugin"
DESCRIPTION = " \
This provides a libyui REST API plugin for the Ncurses frontend. \
This package contains the header files for the plugin. \
 \
This is not needed for using the REST API, only for developing \
extensions for it."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-rest-api-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "0d1ea9e34151e7442b7d8ff3cacf53d90bd28a7af28fd732517ce77e4e9375afda3a8d4eee5b282e889453449f0198116e367e98e5aeed9668219284e5f33290"

RPROVIDES:${PN} += "libyui-ncurses-rest-api-devel"

RDEPENDS:${PN} += "glibc-devel \
libstdc++-devel \
libyui-ncurses-devel \
libyui-ncurses-rest-api16 \
libyui-rest-api-devel"

inherit rpm
