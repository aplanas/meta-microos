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

PV = "5.3.6"

RPM_NAME = "lua53-doc-5.3.6-2.3.noarch.rpm"
RPM_HASH = "2ef55e4548827991e48418e2c4be5027754e90fa7bb16000ccd1be3fc2db667819173760be8767faa7713499bb20a1eabd12e93c39b8b5a158d1a3c9988e415b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-doc"
RDEPENDS:${PN} += ""

inherit rpm
