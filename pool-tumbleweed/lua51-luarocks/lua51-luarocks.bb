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

RPM_NAME = "lua51-luarocks-3.9.1-4.3.noarch.rpm"
RPM_HASH = "1eecf4eb5286627cb9df7b6b059efdac29d2162aa92ee7beb63f71ba7f0e01861a6633eb19e960a544ebeed01dcb5762bc1cef431faa63447c68a1ca29a93ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lua51-luarocks) \
lua51-luarocks"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.1 \
curl \
lua51 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
