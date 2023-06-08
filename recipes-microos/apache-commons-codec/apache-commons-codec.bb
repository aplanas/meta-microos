SUMMARY = "Apache Commons Codec Package"
DESCRIPTION = "Commons Codec is an attempt to provide definitive implementations of \
commonly used encoders and decoders."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "apache-commons-codec-1.15-2.4.noarch.rpm"
RPM_HASH = "80326b158fa01e9708d717c026406d8ff374f8315d2b7fda4976fc6ffedb6ce0508080a0bfdcb2dc094d3d3c0f261b1c6e7bddf8ebbaee95c43febeed3cb1621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-codec commons-codec jakarta-commons-codec mvn(commons-codec:commons-codec) mvn(commons-codec:commons-codec:pom:) osgi(org.apache.commons.codec)"
RDEPENDS:${PN} += "java java-headless javapackages-filesystem"

inherit rpm
