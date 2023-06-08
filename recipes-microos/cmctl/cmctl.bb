SUMMARY = "CLI tool that can help you to manage cert-manager resources inside your cluster"
DESCRIPTION = "cmctl is a CLI tool that can help you to manage cert-manager resources inside your cluster. \
While also available as a kubectl plugin, it is recommended to use as a stand alone binary as this allows the use of command auto-completion."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "cmctl-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "33b9fba77386d3d15d4d67f957e75d1e21cb172c66cf1c1c1dcf1b251b644725c2cb28c0e97c8dd33a812a9aa9c80d389f825332abb0c17347a7dd2926f04991"

RPROVIDES:${PN} += "cmctl cmctl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
