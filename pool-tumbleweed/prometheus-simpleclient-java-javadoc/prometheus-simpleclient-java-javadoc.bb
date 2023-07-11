SUMMARY = "Javadoc for prometheus-simpleclient-java"
DESCRIPTION = "This package contains javadoc for prometheus-simpleclient-java."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-javadoc-0.8.0-6.11.noarch.rpm"
RPM_HASH = "613d1d1c5245c60e6a8b235fd08814001fe561086e322f8f2481dabf07b982c666b7a94c9b28e48c196b1fea215163558229fd156aefe93f8595306f5c88320c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-simpleclient-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
