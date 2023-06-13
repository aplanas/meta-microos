SUMMARY = "Extended PEG Notation Format (easy grammars for LPeg)"
DESCRIPTION = "The LPeg library is a powerful tool to parse text and extract parts of \
it using captures. It even provides grammars, which can be used to \
parse non-regular languages, but the complexer the language gets, the \
more difficult error handling and keeping track of captured information \
becomes. luaepnf enhances usage of LPeg grammars by building an abstract \
syntax tree (AST) for the input and providing tools for error reporting, \
as well as offering syntax sugar and shortcuts for accessing LPeg's features."
LICENSE = "MIT"

PV = "0.3+git19"

RPM_NAME = "lua51-luaepnf-0.3+git19-2.1.noarch.rpm"
RPM_HASH = "f0e057fe8260e85a2f4b5871e06ce51572a95ca312697e6044f1bb23773e76e9f30eb34dbe63d1d6c036707abf902f1b032f025fce5c9c688f36d223e7f9d26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-luaepnf"

RDEPENDS:${PN} += "lua51 \
lua51-lpeg"

inherit rpm
