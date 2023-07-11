SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua53-linenoise-0.9-2.5.aarch64.rpm"
RPM_HASH = "97a4bd58ad2e021e1a805af5fe4059df8e561439accfa53a5315cecc9481d1dfc708c988e5b08e91cc380004ebbc292148df845c9050650b197bd1ca9e550686"

RPROVIDES:${PN} += "lua53-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua53"

inherit rpm
