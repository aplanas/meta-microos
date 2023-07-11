SUMMARY = "Istack-commons buildtools"
DESCRIPTION = "This package contains istack-commons buildtools."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-buildtools-3.0.7-4.5.noarch.rpm"
RPM_HASH = "1a726ed934d8f55c9fc6e99f4291b4b3d2deec428a522a48103c513c6f89d562d12e236a049b5de2cb0bce3f0f81f1f50e722dc1d06fa90a9adb1cc6742af8a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-buildtools \
mvn-com.sun.istack-istack-commons-buildtools \
mvn-com.sun.istack-istack-commons-buildtools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.codemodel-codemodel \
mvn-org.apache.ant-ant"

inherit rpm
