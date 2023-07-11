SUMMARY = "Documentation of the Calligra Suite"
DESCRIPTION = "Documentation of the Calligra Office Suite applications."
LICENSE = "GFDL-1.2-only"

PV = "3.2.1"

RPM_NAME = "calligra-doc-3.2.1-7.19.noarch.rpm"
RPM_HASH = "ac0724b3bc5356351d6582d4ba6584dd42bdc480b5bd56948c5d25c348c29802ad0742297a22a3bf1e28aede546bb6662b256c8da8432f8c1da41cdd94722143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-doc"

RDEPENDS:${PN} += "calligra"

inherit rpm
