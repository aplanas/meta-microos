SUMMARY = "The Tilde Toolkit's library for reading and writing configuration files"
DESCRIPTION = "The libt3config library provides functions for reading and writing \
simple structured configuration files."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "libt3config0-1.0.0-1.14.aarch64.rpm"
RPM_HASH = "4deaf8bc09881b20e3c7c7faed58b13a8918f96e172e22f5ff94e15e4d52e84e5c64beb4b3b4ad7e3a692e932ff0e8ba9b7896ac637cda9beb9366c70d18d7c4"

RPROVIDES:${PN} += "libt3config.so.0 \
libt3config0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
