SUMMARY = "Java library for reading and editing user input in console applications"
DESCRIPTION = "JLine is a java library for reading and editing user input in console \
applications. It features tab-completion, command history, password \
masking, customizable keybindings, and pass-through handlers to use to \
chain to other console applications."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "jline1-1.0-2.7.aarch64.rpm"
RPM_HASH = "a1f7c7b2922f8cd954b64e25f992d9ce0f9df747a0ba3469c7a799b96d2d397401eec1d2f57a447254a78d75057a31705c6ab0157703e1dca4f7f024e8a2e228"

RPROVIDES:${PN} += "jline1 \
mvn-jline-jline-1 \
mvn-jline-jline-1.0 \
mvn-jline-jline-pom-1 \
mvn-jline-jline-pom-1.0 \
osgi-jline"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
