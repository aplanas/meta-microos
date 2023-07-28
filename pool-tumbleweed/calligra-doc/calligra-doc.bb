SUMMARY = "Documentation of the Calligra Suite"
DESCRIPTION = "Documentation of the Calligra Office Suite applications."
LICENSE = "GFDL-1.2-only"

PV = "3.2.1"

RPM_NAME = "calligra-doc-3.2.1-7.20.noarch.rpm"
RPM_HASH = "08f61e1952bbfde4aeb54d188a75bef18ad7c4e92435df08d23622af856bc3fdb6fd7c404601bb6bbabe084110d75f7c65fb6a3544cad9c3add63d5a519754b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-doc"

RDEPENDS:${PN} += "calligra"

inherit rpm
