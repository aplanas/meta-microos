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

PV = "1.11.1.1413"

RPM_NAME = "clojure-1.11.1.1413-1.1.noarch.rpm"
RPM_HASH = "5cd3df5a15ccc868e7b3f912ddbd5411bcdd56a779bca3b5d58e5cf742a536231a663effa680c76b89b25d588d3e321ad246c0994d1be770ace0f880a3af802b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
rlwrap"

inherit rpm
