SUMMARY = "WASI libc implementation for WebAssembly"
DESCRIPTION = "WASI libc allows cross platform binaries to be created and executed on a variety of platforms"
LICENSE = "MIT"

PV = "19"

RPM_NAME = "wasi-libc-19-1.1.noarch.rpm"
RPM_HASH = "60fa7e2864bc14f7dcb648f04a54c81f1bc75f548bae9e25561b0646e2d3acbb6bdcc113a5c6359ac5eb3fd7d0d1233b6029d98619a2a2c192556093ee770ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wasi-libc"

RDEPENDS:${PN} += ""

inherit rpm
