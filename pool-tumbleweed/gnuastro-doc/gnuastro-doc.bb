SUMMARY = "Documentation for the GNU Astromomy Utilities"
DESCRIPTION = "Additional documentation for the GNU Astromomy Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-doc-0.19-1.12.noarch.rpm"
RPM_HASH = "142499f32c31b5348b7d3474a2277b04945f0b2760813cc494b769093c25db007bfed66a33cbc1b8343d2809a2335e654cfe06f3776323cfe030d3bd587f1754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-doc"

RDEPENDS:${PN} += ""

inherit rpm
