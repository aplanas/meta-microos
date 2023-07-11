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

RPM_NAME = "lua54-doc-5.4.6-1.2.noarch.rpm"
RPM_HASH = "371762100e954e0e8ce4f0faf74f4396152a7a9f7dcdb3c8695825727d357f612df6e72e187cd24ba40f176d145ad5b3a1d75357fa43c9b60736f2174af5dde8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-doc"

RDEPENDS:${PN} += ""

inherit rpm
