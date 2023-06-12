SUMMARY = "Documentation of the Calligra Suite"
DESCRIPTION = "Documentation of the Calligra Office Suite applications."
LICENSE = "GFDL-1.2-only"

PV = "3.2.1"

RPM_NAME = "calligra-doc-3.2.1-7.17.noarch.rpm"
RPM_HASH = "52833f4a8baed429da9689847ca615f149a0005d79d02b4ef7f8ee083592a8546925a2d478846e4b585c177246df22042179bca93b73af879c34d35a864d5cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-doc"
RDEPENDS:${PN} += "calligra"

inherit rpm
