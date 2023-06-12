SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "lua54-moonscript-0.5.0-4.2.noarch.rpm"
RPM_HASH = "8c39d7f1f1e2a866bd64ac60dd2dd7d15016ecae9b3b2e319d355195b7d7af69d6ce74061b26a3e3bdc307e2d351d976bf6daa312b08316fe7a01cfee584dede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-moonscript \
lua54-moonscript"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.4 \
lua54 \
lua54-alt-getopt \
lua54-argparse \
lua54-loadkit \
lua54-lpeg \
lua54-luafilesystem \
update-alternatives"

inherit rpm
