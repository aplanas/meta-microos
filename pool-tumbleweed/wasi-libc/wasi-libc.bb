SUMMARY = "WASI libc implementation for WebAssembly"
DESCRIPTION = "WASI libc allows cross platform binaries to be created and executed on a variety of platforms"
LICENSE = "MIT"

PV = "19"

RPM_NAME = "wasi-libc-19-1.2.noarch.rpm"
RPM_HASH = "0ab4b6ae1942053af4a28000322f714e44ee32ec2a327f851ae3ffdaa63e51b732a942b471ff9ecb82d772188fde85668e9da0eac450404079a7eff043930d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wasi-libc"

RDEPENDS:${PN} += ""

inherit rpm
