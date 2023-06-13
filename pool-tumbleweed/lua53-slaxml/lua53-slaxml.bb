SUMMARY = "SAX-like streaming XML parser for Lua"
DESCRIPTION = "SLAXML is a pure-Lua SAX-like streaming XML parser. It is more \
robust than many (simpler) pattern-based parsers that exist \
(such as mine), properly supporting code like \
<expr test='5 > 7' />, CDATA nodes, comments, namespaces, and \
processing instructions. \
 \
It is currently not a truly valid XML parser, however, as \
it allows certain XML that is syntactically-invalid (not \
well-formed) to be parsed without reporting an error."
LICENSE = "MIT"

PV = "0.7+git20191225.108970c"

RPM_NAME = "lua53-slaxml-0.7+git20191225.108970c-3.1.noarch.rpm"
RPM_HASH = "30256299089b2b235ce44bd6afdaf8f28b29f67f41130da81fff9a5d7a9d44ad5e1f8c9d337c444099b9252f91456a5e23f6914df83c04f715f7e940b3862425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-slaxml"

RDEPENDS:${PN} += "lua53"

inherit rpm
