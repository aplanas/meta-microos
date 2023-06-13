SUMMARY = "Javadoc for trilead-ssh2"
DESCRIPTION = "API documentation for trilead-ssh2."
LICENSE = "BSD-3-Clause & MIT"

PV = "217.8"

RPM_NAME = "trilead-ssh2-javadoc-217.8-2.6.noarch.rpm"
RPM_HASH = "4edde256057c879fc4a6d3c9972984a4e0713cea4126b669550f1c43cf5db56a3fcdd50b826429f52403130d998c20261c7e2711a9efd512a41fe469ee31da9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilead-ssh2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
