SUMMARY = "Disk Usage/Free Utility"
DESCRIPTION = "Disk Usage/Free Utility (Linux, BSD, macOS & Windows)"
LICENSE = "MIT"

PV = "0.8.1+git64.24c3369"

RPM_NAME = "duf-0.8.1+git64.24c3369-1.1.aarch64.rpm"
RPM_HASH = "447a84b58b1d9a0d77e6e70759b10db501a0a2d167a1029440efe8ec93203411840d99c26fb2ad845e74a49c6eae9d0de0108ebccc417902c5c7422731796c2d"

RPROVIDES:${PN} += "duf \
duf(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
