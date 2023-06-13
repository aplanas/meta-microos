SUMMARY = "Javadoc for prometheus-simpleclient-java"
DESCRIPTION = "This package contains javadoc for prometheus-simpleclient-java."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-javadoc-0.8.0-6.10.noarch.rpm"
RPM_HASH = "21e4087f7e5c73f07f3ab7e8ce5e135757e1f9d3692d47a0f617c0eafc9c3dae4804fa40e49bd80cd59cab9eb643c29dd9ab76b893ac0d6d9b27248b883897fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-simpleclient-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
