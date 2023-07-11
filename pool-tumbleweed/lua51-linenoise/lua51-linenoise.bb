SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua51-linenoise-0.9-2.5.aarch64.rpm"
RPM_HASH = "73a84ac6f9b9c1cd4dee06cb306f87dfa0b67ace26760dff25e39db5297194acb3659c5585ed072f514695727e6a88459fc9480edc217ee2c96d4b41ae9365be"

RPROVIDES:${PN} += "lua51-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua51"

inherit rpm
