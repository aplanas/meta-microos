SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "lua51-cassowary-2.3.2-3.1.noarch.rpm"
RPM_HASH = "bdf1a3d1aa06c71def4b6696b970a0281b97c061cf6933382b59d6692de5a56fcf31918ddbcd56472049578d4d0884bfe505ace689e5b6c455f14165b4208f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-cassowary"
RDEPENDS:${PN} += "lua51 \
lua51-penlight"

inherit rpm
