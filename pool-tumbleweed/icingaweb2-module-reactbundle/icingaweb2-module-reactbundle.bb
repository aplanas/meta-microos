SUMMARY = "ReactPHP-based 3rd party libraries"
DESCRIPTION = "Icinga Web 2 - ReactPHP-based 3rd party libraries"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "icingaweb2-module-reactbundle-0.9.0-1.6.noarch.rpm"
RPM_HASH = "c918aa1c9bf7234f777483234f704418af5951475d8244f29faf9f3433bfd5f3fdc43783030cbbb7b844f313073764532724818cba74bbf56d7ff01019ac3b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-reactbundle"

RDEPENDS:${PN} += "icingaweb2 \
icingaweb2-module-director"

inherit rpm
