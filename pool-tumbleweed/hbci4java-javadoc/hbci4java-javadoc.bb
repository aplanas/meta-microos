SUMMARY = "Javadoc for hbci4java"
DESCRIPTION = "Developer documentation of HBCI4Java."
LICENSE = "LGPL-2.1-only"

PV = "3.1.64"

RPM_NAME = "hbci4java-javadoc-3.1.64-1.3.noarch.rpm"
RPM_HASH = "592a3565108176989de7241279e97a63bd2912539c0deee8902b746a1dfcf6a1f73936b213a2a655fe2e142e080dda8bb25436ca46740846159bf0919cb3b191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hbci4java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
