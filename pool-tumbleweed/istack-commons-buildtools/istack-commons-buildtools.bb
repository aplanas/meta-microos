SUMMARY = "Istack-commons buildtools"
DESCRIPTION = "This package contains istack-commons buildtools."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-buildtools-3.0.7-4.4.noarch.rpm"
RPM_HASH = "c6af5afff1f0a51b7260db0023ffc68422b0ba740552663bb79e1d758a70ff1334dbf1754494ba06f9e2b9093ed3519b740b5a634baa9f5f6df9f8f3a3cdd093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-buildtools \
mvn(com.sun.istack:istack-commons-buildtools) \
mvn(com.sun.istack:istack-commons-buildtools:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.sun.codemodel:codemodel) \
mvn(org.apache.ant:ant)"

inherit rpm
