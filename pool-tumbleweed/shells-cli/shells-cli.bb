SUMMARY = "Shells.com command line interface"
DESCRIPTION = "Command line tool for interacting with the Shells.com backend system."
LICENSE = "MIT"

PV = "0~20210507"

RPM_NAME = "shells-cli-0~20210507-1.10.aarch64.rpm"
RPM_HASH = "f66edb4150d13eacee830de59a3c5daa0020d85e884d70a2eb1a71a8159c518cebdddf5a79d4c91a5c8bef67f0a0be699a32cb9fc22a8943108da471fa24107e"

RPROVIDES:${PN} += "shells-cli"

RDEPENDS:${PN} += ""

inherit rpm
