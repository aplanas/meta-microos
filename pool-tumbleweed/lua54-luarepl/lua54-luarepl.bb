SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua54-luarepl-0.10-2.2.noarch.rpm"
RPM_HASH = "4c9ae57c98ede70e984f38ff34d2b18d79295fc90b92e94da825ba0ec06a04a5225f20e498b9d9faef5e8cb5d01a2135303ad53cb118bd6b80696dac3861ecf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luarepl \
lua54-luarepl"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.4 \
bash-sh \
lua54 \
update-alternatives"

inherit rpm
