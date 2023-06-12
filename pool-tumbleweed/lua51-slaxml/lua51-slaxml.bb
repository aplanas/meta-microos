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

RPM_NAME = "lua51-slaxml-0.7+git20191225.108970c-3.1.noarch.rpm"
RPM_HASH = "a75ddc7f5db23b058ee6e1f1b591d197aa351021cfcb0473a2af34aa95810beed88e77179dd9b2abd20df25d73acd2086ed06e84778bdba82769e3ffdc472e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-slaxml"
RDEPENDS:${PN} += "lua51"

inherit rpm
