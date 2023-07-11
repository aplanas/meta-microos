SUMMARY = "Rsh server compatibility package for mrlogind/mrshd"
DESCRIPTION = "This package provides rsh server compatibility for mrlogind/mrshd"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-rsh-server-compat-2.12-13.4.aarch64.rpm"
RPM_HASH = "60396a4dbe4f68a0876e7795ffd10fbff406b516a78d9157c833d8dc1ef84ce71896c82fce28a2cc921b779ec536f7bc9a8e4ecea4ed47a93eae11f01c5d6c8c"

RPROVIDES:${PN} += "mrsh-rsh-server-compat \
rsh-server"

RDEPENDS:${PN} += "mrsh-server"

inherit rpm
