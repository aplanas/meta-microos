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

PV = "5.4.6"

RPM_NAME = "lua54-doc-5.4.6-1.1.noarch.rpm"
RPM_HASH = "44886b639bca04d18712590054059435775569f4f1d0e528c0ce2bf330f77d4bffab896c7326e6c5910443159ea55fbaf8559c9e78d3a912b7919518d899dc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-doc"

RDEPENDS:${PN} += ""

inherit rpm
