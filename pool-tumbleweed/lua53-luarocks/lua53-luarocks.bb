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

RPM_NAME = "lua53-luarocks-3.9.1-4.3.noarch.rpm"
RPM_HASH = "34f43f17c65a3439b867620e0094e1f6ed4e455267b8c61429d330852c51bbb1185c8460a2c82da39f8e86fb645c33d445ce612d5358f7cb68d4d58995d566a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lua53-luarocks \
lua53-luarocks"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.3 \
curl \
lua53 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
