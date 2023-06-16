SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua51-luarepl-0.10-2.2.noarch.rpm"
RPM_HASH = "d52f86aa5a62ed351f358f9e9d94125196ff1217c28b7d248e668bcd7871689ad81b30329b841bdec2a2940b258dc838f1eda4da31805da6dd8110d0a6f6ec0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-luarepl"

RDEPENDS:${PN} += "/usr/bin/lua5.1 \
/usr/bin/sh \
bash-sh \
lua51 \
update-alternatives"

inherit rpm
