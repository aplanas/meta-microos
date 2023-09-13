SUMMARY = "High performance Java library that provides reflection by using code generation"
DESCRIPTION = "ReflectASM is a very small Java library that provides \
high performance reflection by using code generation. \
An access class is generated to set/get fields, \
call methods, or create a new instance. The access class \
uses byte-code rather than Java's reflection, so it \
is much faster. It can also access primitive fields \
via byte-code to avoid boxing."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "reflectasm-1.11.1-2.1.noarch.rpm"
RPM_HASH = "ab8c9a7e8050b1c5ad8fb65aac4e864c23ddabcda6d0187b12358d9ad7bfaa4db2dcc344254c7438c01f77e099d7fd897035b9f53ecb10a0d7fa28369cf06688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.esotericsoftware-reflectasm \
mvn-com.esotericsoftware-reflectasm-pom- \
mvn-com.esotericsoftware.reflectasm-reflectasm \
mvn-com.esotericsoftware.reflectasm-reflectasm-pom- \
osgi-com.esotericsoftware.reflectasm \
reflectasm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm"

inherit rpm
