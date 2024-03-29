SUMMARY = "Javadoc for prometheus-simpleclient-java"
DESCRIPTION = "This package contains javadoc for prometheus-simpleclient-java."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-javadoc-0.8.0-7.1.noarch.rpm"
RPM_HASH = "23c866781a6bb9a5f6b9df84a70805e84e0a8046e34f6477120f8619c5f5067e4488f7372e61514331669716590a083f91d4fdfc3be16d450be45f56b50e8acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-simpleclient-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
