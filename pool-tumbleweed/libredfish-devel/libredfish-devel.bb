SUMMARY = "Headers for building apps that use libredfish"
DESCRIPTION = "This package contains headers required to build applications that use libredfish."
LICENSE = "BSD-3-Clause"

PV = "1.3.6.4+git.a0788d4"

RPM_NAME = "libredfish-devel-1.3.6.4+git.a0788d4-1.2.aarch64.rpm"
RPM_HASH = "3d7ce3cc5281b034f4795e45a28a26d471829740848837253bd2ec9051920c1d3343f7a716adafbc5e578bd3b964518c0fe0df7f6dd47d8104a8a04953f32951"

RPROVIDES:${PN} += "libredfish-devel \
libredfish-devel(aarch-64)"

RDEPENDS:${PN} += "libredfish1"

inherit rpm
