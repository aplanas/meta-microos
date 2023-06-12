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

RPM_NAME = "reflectasm-1.11.1-1.3.noarch.rpm"
RPM_HASH = "ff712bf64d03182388b58f83fb7a7830472a9288395a46a30cb14458f1b8188706f50e8ffc6e1b3f9184c640d032559209cc37dc484328b49abd92a6beb3c964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.esotericsoftware.reflectasm:reflectasm) \
mvn(com.esotericsoftware.reflectasm:reflectasm:pom:) \
mvn(com.esotericsoftware:reflectasm) \
mvn(com.esotericsoftware:reflectasm:pom:) \
osgi(com.esotericsoftware.reflectasm) \
reflectasm"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.ow2.asm:asm)"

inherit rpm
