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

RPM_NAME = "lua53-doc-5.3.6-2.4.noarch.rpm"
RPM_HASH = "ccfaca03693bb8eb630bb9d0557137dc5117aa8e1c175345ffc1f99d52c2007cd703a45c094d33551e38370a49a2ecf38d608c8a9363d96d189dc96ff5088642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-doc"

RDEPENDS:${PN} += ""

inherit rpm
