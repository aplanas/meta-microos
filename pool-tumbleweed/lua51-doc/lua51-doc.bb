SUMMARY = "Documentation for Lua, a small embeddable language"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
Lua combines procedural syntax (similar to Pascal) with \
data description constructs based on associative arrays and extensible \
semantics. Lua is dynamically typed, interpreted from byte codes, and \
has automatic memory management, making it suitable for configuration, \
scripting, and rapid prototyping. Lua is implemented as a small library \
of C functions, written in ANSI C."
LICENSE = "MIT"

PV = "5.1.5"

RPM_NAME = "lua51-doc-5.1.5-15.16.noarch.rpm"
RPM_HASH = "bd2890317135df3dad14cffd1eebf47e2f4640e1a741ab68efec224653db6693cba7ebf1e4a34a9c3ee828e9a6e1acc2aeeb7d2a400c9aef37218401271f17c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-doc"

RDEPENDS:${PN} += ""

inherit rpm
