SUMMARY = "CLI tool that can help you to manage cert-manager resources inside your cluster"
DESCRIPTION = "cmctl is a CLI tool that can help you to manage cert-manager resources inside your cluster. \
While also available as a kubectl plugin, it is recommended to use as a stand alone binary as this allows the use of command auto-completion."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "cmctl-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "aa8a76f697a2e7dbd7672b6ea0f4a30e380e0f8426f30599806169fddd5e195468bbc2b0c0ec284746b19196349119e26b6efb1330624c7374c02e06d8207e3e"

RPROVIDES:${PN} += "cmctl cmctl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
