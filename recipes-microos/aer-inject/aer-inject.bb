SUMMARY = "Inject PCIE AER errors into a running kernel"
DESCRIPTION = "aer-inject allows to inject PCIE AER errors on the software level into \
a running Linux kernel. This is intended for validation of the PCIE \
driver error recovery handler and PCIE AER core handler."
LICENSE = "GPL-2.0"

PV = "0.2"

RPM_NAME = "aer-inject-0.2-1.28.aarch64.rpm"
RPM_HASH = "678cc13f746dd5abec2302fb20d9978f3220b5c916d4a06dfba5242be976bc6361d0f3bdf73ffbf57767dcb3be9a8199961158dd0979870420bc2b4b8b480ed7"

RPROVIDES:${PN} += "aer-inject aer-inject(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
