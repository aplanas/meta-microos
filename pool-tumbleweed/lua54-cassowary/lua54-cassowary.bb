SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "lua54-cassowary-2.3.2-3.1.noarch.rpm"
RPM_HASH = "4cc7878d2d830aa3451b95e0992a98bcd67b3421880f9dd1a6b7085ddd389fb0ddb2a02404975925061a712f20934bf814bc5916454abd85cda17e07893818d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-cassowary \
lua54-cassowary"

RDEPENDS:${PN} += "lua54 \
lua54-penlight"

inherit rpm
