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

RPM_NAME = "reflectasm-1.11.1-1.4.noarch.rpm"
RPM_HASH = "5771b0e8b41cba506dfffaabdbc98b6733cd69effe5bb600f59de4c8499ea41b3897071548d985dc4ed07f7256a55bead63f9ebba748fbc8c82d77c3b96d5d77"
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
