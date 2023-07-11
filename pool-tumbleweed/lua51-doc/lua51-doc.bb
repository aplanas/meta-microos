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

RPM_NAME = "lua51-doc-5.1.5-15.17.noarch.rpm"
RPM_HASH = "af6b6dd15b5db9e56ee45bd8b1a205a04c23c9fe498aab2b4f58d31f1638bba77eb492f222fbaebcea1ca836c254c73b94fec4c5d3f917d08675a6c1acdcf16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-doc"

RDEPENDS:${PN} += ""

inherit rpm
