SUMMARY = "Documentation for Icinga 2"
DESCRIPTION = "This subpackage provides documentation for Icinga 2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-doc-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "507cc6d0800a68783fe6d9129d5f95a8f40dc1f29df2905d68fd8a5c39d7c27acea08571662325025adece23c83dbd1bc3355fe0c8ce729ed990f1aef882dd0d"

RPROVIDES:${PN} += "icinga2-doc"

RDEPENDS:${PN} += ""

inherit rpm
