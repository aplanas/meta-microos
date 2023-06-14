SUMMARY = "Java library for reading and editing user input in console applications"
DESCRIPTION = "JLine is a java library for reading and editing user input in console \
applications. It features tab-completion, command history, password \
masking, customizable keybindings, and pass-through handlers to use to \
chain to other console applications."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "jline1-1.0-2.6.aarch64.rpm"
RPM_HASH = "0ba9585261b3cefa2ee35e3ea50af5e91642d7643e7ff77b04f37dbb0a257366495e5a5b27ee289e715cc7c8ef830dc2b3ca80869620bb89d1a888573e3ac1ec"

RPROVIDES:${PN} += "jline1 \
mvn-jline-jline-1 \
mvn-jline-jline-1.0 \
mvn-jline-jline-pom-1 \
mvn-jline-jline-pom-1.0 \
osgi-jline"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
