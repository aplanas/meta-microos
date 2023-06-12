SUMMARY = "Development files for clthreads"
DESCRIPTION = "Development files for clthreads including headers and libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.2"

RPM_NAME = "clthreads-devel-2.4.2-2.11.aarch64.rpm"
RPM_HASH = "a08377d18ea4d3e4148b0b43e9526de626f7ffd0f91a757237624946cebef8f74b99e88e371a5a3eef880737fcf591f796906811daae60301827c41de4defc10"

RPROVIDES:${PN} += "clthreads-devel \
clthreads-devel(aarch-64)"
RDEPENDS:${PN} += "libclthreads2"

inherit rpm
