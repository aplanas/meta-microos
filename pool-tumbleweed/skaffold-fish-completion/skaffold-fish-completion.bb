SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "skaffold-fish-completion-2.5.0-1.1.noarch.rpm"
RPM_HASH = "516526bb81d838925e4910b0c03fc830e51e1dcc2583e65f54e52f8482a8d0855f917b4bc9edb5a42252f4ab78fb5f397d03d49a260a23158a8d94bbfbaebe8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
