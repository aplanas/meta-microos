SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "lua53-cassowary-2.3.2-3.1.noarch.rpm"
RPM_HASH = "967c9f80594f22592188cf3e99cd42e5c6e3b3e7b61f5c0a546a69a8df5837fca35b5ca0b8cd8459fba90762c4ed4257704258fe63a97d406ca2de06275302a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cassowary"
RDEPENDS:${PN} += "lua53 \
lua53-penlight"

inherit rpm
