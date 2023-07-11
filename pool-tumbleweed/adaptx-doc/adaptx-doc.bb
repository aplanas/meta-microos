SUMMARY = "Documentation for adaptx"
DESCRIPTION = "This package contains the documentation for AdaptX."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-doc-0.9.13-136.7.noarch.rpm"
RPM_HASH = "dec1cf9e3a7b311d8df616b86b78a5b7f42884ec62f672eb9f645b4c43c58e90aebcc33f6a6252bf1e3957c75474a1abd45f4d8f276f19a0c67039edb47a49f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx-doc"

RDEPENDS:${PN} += ""

inherit rpm
