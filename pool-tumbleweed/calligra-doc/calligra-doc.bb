SUMMARY = "Documentation of the Calligra Suite"
DESCRIPTION = "Documentation of the Calligra Office Suite applications."
LICENSE = "GFDL-1.2-only"

PV = "3.2.1"

RPM_NAME = "calligra-doc-3.2.1-7.22.noarch.rpm"
RPM_HASH = "9dfe2aa1159f9120fdb7793c0447cd7258aafc354a7f4411df236f5e48e15e462dcf2b9830f3f8eaad1bd5581258be7a23eca96c87845382ed2761ca106b76b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-doc"

RDEPENDS:${PN} += "calligra"

inherit rpm
