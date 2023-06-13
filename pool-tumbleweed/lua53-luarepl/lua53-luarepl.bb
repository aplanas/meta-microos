SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua53-luarepl-0.10-2.2.noarch.rpm"
RPM_HASH = "b08b9432fe760dce1ca04be6266719bfe1d4f4fcb230409ab948c65385078ed51aba45539b862e102beb174d02008f2c44647e163d187e0127bc5d230a85483e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luarepl"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.3 \
bash-sh \
lua53 \
update-alternatives"

inherit rpm
