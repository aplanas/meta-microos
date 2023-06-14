SUMMARY = "Tools to manage UEFI variables"
DESCRIPTION = "efivar provides a simple command line interface to the UEFI variable facility."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "efivar-38-1.3.aarch64.rpm"
RPM_HASH = "036a9c9e20fa3414121a6ba8388d3799400ca7d6e3578a90aabbe7c4bb41123ada4000d12d991fb0d7c3410992be8d5900fa7d2c842f0a5c1590cd2c571c2ffd"

RPROVIDES:${PN} += "efivar"

RDEPENDS:${PN} += "libc.so.6 \
libefisec.so.1 \
libefivar.so.1 \
libefivar1"

inherit rpm
