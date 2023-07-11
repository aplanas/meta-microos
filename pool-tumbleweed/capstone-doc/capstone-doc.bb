SUMMARY = "Documentation for capstone, a disassembly framework"
DESCRIPTION = "Capstone is a multi-architecture disassembly framework."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "capstone-doc-4.0.2-2.4.noarch.rpm"
RPM_HASH = "d80edfc31154ee1dadf25511271587a2cb1973a92a40d9afe1f4af16b54304631d6260d90705c90ddbcfe0ff6229ea86b5acd2053f26f26c7eb8593c82f092b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "capstone-doc"

RDEPENDS:${PN} += ""

inherit rpm
