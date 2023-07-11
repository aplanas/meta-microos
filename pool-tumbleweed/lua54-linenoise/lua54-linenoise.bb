SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua54-linenoise-0.9-2.5.aarch64.rpm"
RPM_HASH = "72d8579bd910db9bb7ca8214333dd349f25ae6ff09995c246bcefec9d9eaa06c584d6b2eec78c6ce86d43b1b29f001559b37ff64710b9a5842c3cdce2e696063"

RPROVIDES:${PN} += "lua-linenoise \
lua54-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua54"

inherit rpm
