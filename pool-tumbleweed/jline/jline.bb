SUMMARY = "Java library for reading and editing user input in console applications"
DESCRIPTION = "JLine is a java library for reading and editing user input in console \
applications. It features tab-completion, command history, password \
masking, customizable keybindings, and pass-through handlers to use to \
chain to other console applications."
LICENSE = "BSD-3-Clause"

PV = "2.14.6"

RPM_NAME = "jline-2.14.6-5.5.noarch.rpm"
RPM_HASH = "d9190b8515e537f1c9468a66551fcc3d7424107ce1b207c59fa8f38040580c3fb1fc6e9f11acfffd890c51e18f605605945348f766562ab17d2f11cc5d0ac37e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline \
mvn-jline-jline \
mvn-jline-jline-pom- \
osgi-jline"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fusesource.jansi-jansi"

inherit rpm
