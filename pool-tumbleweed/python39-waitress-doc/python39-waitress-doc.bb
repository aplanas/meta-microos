SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python39-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python39-waitress-doc-2.1.2-6.1.noarch.rpm"
RPM_HASH = "1a7be52ff2dc7367b158390f2ad9efc79af81867377d4852551fed9868dbaa793d6f8667538039253d0663b3f2f44a21a8cfbb8a93bf41310280ef637fe573c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
