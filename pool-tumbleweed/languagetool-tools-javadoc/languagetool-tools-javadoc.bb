SUMMARY = "Javadoc for languagetool-tools"
DESCRIPTION = "This package contains javadoc for languagetool-tools."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-tools-javadoc-4.8-3.2.noarch.rpm"
RPM_HASH = "54dce796ab7426477ce0372f22030cdf7e0537e63a2925f63c99da43e51f5e02026c285821f1d30251ca8a157ffa256f0656622cc323dbab749ba5acb1b57ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
