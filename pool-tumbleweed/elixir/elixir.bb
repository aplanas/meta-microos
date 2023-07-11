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

RPM_NAME = "elixir-1.14.2-3.4.noarch.rpm"
RPM_HASH = "3b3c200ccac0e6b4e9880c76defa7bf6b37cae9e4f1819bb7bdb061e88ca201452d528220495eb6d73cd0fe4e77e50047bdab081d9e2906d5ed3657c11497372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir \
rpm-macro-elixir-dir \
rpm-macro-elixir-libdir \
rpm-macro-mix-compile"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang"

inherit rpm
