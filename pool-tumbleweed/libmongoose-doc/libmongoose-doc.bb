SUMMARY = "Documentation for libmongoose"
DESCRIPTION = "Documentation for libmongoose."
LICENSE = "GPL-3.0-only"

PV = "5.13.0"

RPM_NAME = "libmongoose-doc-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "6ec94d2870be7fd3bc3c41000bb0feed32c0a349527ec1ddc29cd94c753f9d0d63da59ab202b1f3ff865d0eaf72bf05a2ced712baf364cfb688c65ae514bf3e3"

RPROVIDES:${PN} += "libmongoose-doc"

RDEPENDS:${PN} += ""

inherit rpm
