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

PV = "1.11.1.1273"

RPM_NAME = "clojure-1.11.1.1273-1.1.noarch.rpm"
RPM_HASH = "2b263f57e73dc01eb44824918f551c5f4a1e1ef0f925c824aa5abd7e2e372023d0fc18eb849f78429cc36e7f8912ef7c81e8fbe30974ec3699f6bc7e56afc31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure"
RDEPENDS:${PN} += "/bin/bash java rlwrap"

inherit rpm
