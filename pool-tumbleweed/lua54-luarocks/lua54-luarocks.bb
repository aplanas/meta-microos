SUMMARY = "A deployment and management system for Lua modules"
DESCRIPTION = "LuaRocks allows you to install Lua modules as self-contained packages \
called 'rocks', which also contain version dependency \
information. This information is used both during installation, so \
that when one rock is requested all rocks it depends on are installed \
as well, and at run time, so that when a module is required, the \
correct version is loaded. LuaRocks supports both local and remote \
repositories, and multiple local rocks trees."
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "lua54-luarocks-3.9.1-4.3.noarch.rpm"
RPM_HASH = "9c3ad07ebf93c6d300db82c6ca497a131205138b48f968e1136c9d08eb9ada020259da6d6fa6505b74a26a1118ad3678d080d30b9539db0de24492ea5558f980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lua54-luarocks \
lua-luarocks \
lua54-luarocks"

RDEPENDS:${PN} += "/usr/bin/lua5.4 \
/usr/bin/sh \
curl \
lua54 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
