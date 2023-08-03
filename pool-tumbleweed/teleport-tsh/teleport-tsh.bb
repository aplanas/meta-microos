SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.2.5"

RPM_NAME = "teleport-tsh-13.2.5-1.1.aarch64.rpm"
RPM_HASH = "947af88270c7dd0c173ed187857a0c95c5df3687492a4e1bd0902bb499f3e0da82f1de0223c8e9b75826d2c0aa66951d959660d7dfd90e284d273737b527c731"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
