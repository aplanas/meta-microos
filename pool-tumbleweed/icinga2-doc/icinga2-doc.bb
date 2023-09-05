SUMMARY = "Documentation for Icinga 2"
DESCRIPTION = "This subpackage provides documentation for Icinga 2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-doc-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "8b98d1a86606c012682a2c0fdde385141ad52ba0966dcdb75469bcabbb3c6472219c8ec6040ac2e9cccee49031b3b4f7420fb63a8b341f2c36f22ab6cb158296"

RPROVIDES:${PN} += "icinga2-doc"

RDEPENDS:${PN} += ""

inherit rpm
