SUMMARY = "Documentation for capstone, a disassembly framework"
DESCRIPTION = "Capstone is a multi-architecture disassembly framework."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "capstone-doc-4.0.2-2.3.noarch.rpm"
RPM_HASH = "b160a189cd3d036f1cc5851806ea725c16fe8841fc463039be9fb399f50ff8ec12c73c8ab0cf3ca6c9cd47e1ff463cede8f92161d254027f7c78a23762eb97e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "capstone-doc"

RDEPENDS:${PN} += ""

inherit rpm
