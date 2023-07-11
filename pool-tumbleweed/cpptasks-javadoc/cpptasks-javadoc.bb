SUMMARY = "Javadoc for cpptasks"
DESCRIPTION = "Javadoc documentation for Javadoc for cpptasks."
LICENSE = "Apache-2.0"

PV = "1.0b5"

RPM_NAME = "cpptasks-javadoc-1.0b5-7.15.noarch.rpm"
RPM_HASH = "8c6274670af8e7d90db9d6d1c389f95083452da20ad819498ba4761f315c97201c91e6f843d7327cedc482c16764d93701edcedc1eee90858a665d3b25c41949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpptasks-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
