SUMMARY = "API documentation for Sisu"
DESCRIPTION = "This package contains API documentation for Sisu."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-javadoc-0.3.5-3.5.noarch.rpm"
RPM_HASH = "f459b11fede61391b433bd8cb9806dfad0c051ac5be530b8de44a1e85f3cd1e0e3ab60bbbe2b5cb74398cd5a894a017cbe4fa5d0d6517db366f6974481f277f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
