SUMMARY = "Development files for libt3config, a library for reading/writing config files"
DESCRIPTION = "The libt3config library provides functions for reading and writing \
simple structured configuration files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3config."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "libt3config-devel-1.0.0-1.15.aarch64.rpm"
RPM_HASH = "8e0c53ca70803a3c60a6d656c90f36759bdabdcd5c93f756ac9f860a5c776e81cb78aea30ffe656303484d3759eee9962eb918664acd97fc1b81b36cf4eaa5fe"

RPROVIDES:${PN} += "libt3config-devel \
pkgconfig-libt3config"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3config0"

inherit rpm
