SUMMARY = "API documentation for Sisu"
DESCRIPTION = "This package contains API documentation for Sisu."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-javadoc-0.3.5-4.1.noarch.rpm"
RPM_HASH = "246b81b47756dcf4925e1aa06b339dba9398d045b9bf75bbc24a7811d55d5f9038eefc39dcc84649e3ae968fed44b289bd8a5ce620f41306c5f9c461c2408ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
