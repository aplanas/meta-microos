SUMMARY = "Command-line parsing module similar to getopt"
DESCRIPTION = "Command-line parsing module that uses a syntax similar to that of GNU getopt."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "erlang-getopt-1.0.2-1.1.aarch64.rpm"
RPM_HASH = "ae68199a19e1099c735c255f3db94a7a172dcd72fbd2d25cdbd08523780b45cdd0bbf6115f9fe75835f7e9dcb68125129c39b53766d9fb9904630519ff76de4b"

RPROVIDES:${PN} += "erlang-getopt \
erlang-getopt(aarch-64)"

RDEPENDS:${PN} += "erlang"

inherit rpm
