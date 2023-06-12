SUMMARY = "A dynamic programming language that targets the JVM"
DESCRIPTION = "Clojure is a dynamic programming language that targets the Java \
Virtual Machine (and the CLR, and JavaScript). It is designed to be a \
general-purpose language, combining the approachability and \
interactive development of a scripting language with an \
infrastructure for multithreaded programming. Clojure is a \
compiled language - it compiles directly to JVM bytecode, yet remains \
completely dynamic. Every feature supported by Clojure is supported at \
runtime. Clojure provides access to the Java frameworks, with \
optional type hints and type inference, to ensure that calls to Java \
can avoid reflection."
LICENSE = "EPL-1.0"

PV = "1.11.1.1342"

RPM_NAME = "clojure-1.11.1.1342-1.1.noarch.rpm"
RPM_HASH = "895fcffef5e2fae8d3e78d1a4d301f9ad69f79e9d897cfc4a54d8fbe3010857f59bd06edd2e56cff2ec6af5fd286e2623aabb4454a8a4032ceede7be69bf790e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure"
RDEPENDS:${PN} += "/bin/bash java rlwrap"

inherit rpm
