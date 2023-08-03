SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.2.5"

RPM_NAME = "teleport-tctl-13.2.5-1.1.aarch64.rpm"
RPM_HASH = "d83f680606e341d247b38dbedaeb3f4ca80308b30429a9ed1b763a96ccaabee98a8e294e01d72dba5abb6bc06cf70710ccd429ff37761ff4c0bfa5292f9b8360"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
