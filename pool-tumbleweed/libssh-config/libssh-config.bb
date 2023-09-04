SUMMARY = "SSH library configuration files"
DESCRIPTION = "Configuration files for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh-config-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "391461f50312ff43e358c591598b954e6b6ec90d0cbcae069894e3e62d9899bdaa6ffc6c4680f9dfad221e52d4d8e0d963bc672f95355f5c55bed34c9cc05f27"

RPROVIDES:${PN} += "config-libssh-config \
libssh-config"

RDEPENDS:${PN} += ""

inherit rpm
