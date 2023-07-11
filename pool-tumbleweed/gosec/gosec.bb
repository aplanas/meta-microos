SUMMARY = "Golang security checker"
DESCRIPTION = "Inspects source code for security problems by scanning the go abstract syntax tree."
LICENSE = "Apache-2.0"

PV = "2.16.0"

RPM_NAME = "gosec-2.16.0-1.2.aarch64.rpm"
RPM_HASH = "3454873eec444ee19a96c5b04e9c385841d00f7e80d886981f475a4c0a7bf840e9cd29e710c913f6e85d0b05d7774849e26ae0c5afad6c34d8fd84525e2ba381"

RPROVIDES:${PN} += "gosec"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
