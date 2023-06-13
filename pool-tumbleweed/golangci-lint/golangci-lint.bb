SUMMARY = "A fast Go linters runner"
DESCRIPTION = "golangci-lint is a fast Go linters runner. It runs linters in parallel, uses \
caching, supports yaml config, has integrations with all major IDE and has \
dozens of linters included."
LICENSE = "GPL-3.0-only"

PV = "1.53.2"

RPM_NAME = "golangci-lint-1.53.2-1.1.aarch64.rpm"
RPM_HASH = "a80f5ffafa680031a9c05b87bb420f1cdc88c63d520d45c695174975f4cba2d9221e58b5a01676d0f5dbabfcfd5227bdcadd5c5046cc4955caad9a67f7ee5940"

RPROVIDES:${PN} += "golangci-lint \
golangci-lint(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
