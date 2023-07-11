SUMMARY = "Javadoc for truth"
DESCRIPTION = "This package contains the API documentation for truth."
LICENSE = "Apache-2.0"

PV = "0.24"

RPM_NAME = "truth-javadoc-0.24-3.11.noarch.rpm"
RPM_HASH = "aa6c4c583e7b0ddddfe15b643626cc7602124f17f648504bc24affe20629c34204f99eda7e527639e98022d693ae35fa04719fc3750220fd3c02d24b1b3cb52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "truth-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
