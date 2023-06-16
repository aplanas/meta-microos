SUMMARY = "Functional meta-programming aware language built atop Erlang"
DESCRIPTION = "Elixir is a functional meta-programming aware language built on top \
of the Erlang VM. It is a dynamic language with flexible syntax with \
macros support that leverage Erlang's abilities to build concurrent, \
distributed, fault-tolerant applications with hot code upgrades. \
 \
Elixir also provides first-class support for pattern matching, \
polymorphism via protocols (similar to Clojure's), aliases and \
associative data structures (usually known as dicts or hashes in \
other programming languages). \
 \
Finally, Elixir and Erlang share the same bytecode and data types. \
This means one can invoke Erlang code from Elixir (and vice-versa) \
without any conversion or performance impact."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "elixir-1.14.2-2.4.noarch.rpm"
RPM_HASH = "b1d8e533cc6b514b25d391fded7339ab69b9cade8a5930c0bd90524a74cff5817b48f5878ab237286416bcb2a085635c7af6400841947f706981823d15175ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir \
rpm-macro-elixir-dir \
rpm-macro-elixir-libdir \
rpm-macro-mix-compile"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang"

inherit rpm
