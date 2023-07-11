SUMMARY = "A project focused on all aspects of reusable Erlang components"
DESCRIPTION = "Erlware Commons is an Erlware project focused on all aspects of reusable Erlang components."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "erlang-erlware_commons-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "5a61467d5b5c3472b89be3fa4ae81dcd2e04e83fac27d3be8bd18c1396eff356d7a3075f9071cd4852da8ccac5781328b79ea0889b7893bb6fcf834784054803"

RPROVIDES:${PN} += "erlang-erlware-commons"

RDEPENDS:${PN} += "erlang \
erlang-cf"

inherit rpm
