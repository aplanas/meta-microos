SUMMARY = "Documentation for xtl"
DESCRIPTION = "Basic tools (containers, algorithms) used by other quantstack packages."
LICENSE = "BSD-3-Clause"

PV = "0.7.5"

RPM_NAME = "xtl-doc-0.7.5-1.3.noarch.rpm"
RPM_HASH = "d6c7d5669a46340a73b03ba023f4e585bbc849784cb02d6d97ed27bf21dd85746be246f203197b4d1b133c618bc7e1c89938d667bd9a1af52ec4e60473590a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtl-doc"

RDEPENDS:${PN} += ""

inherit rpm
