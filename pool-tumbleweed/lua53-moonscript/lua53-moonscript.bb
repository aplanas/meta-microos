SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "lua53-moonscript-0.5.0-4.2.noarch.rpm"
RPM_HASH = "f826ee10ccafc5341ad6caf04796aebc173a84b02818bf28a6b25f448431bacd5744faa0fcfbc14ef32482260f27d38eef188f97e54618ffc98757056c947d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-moonscript"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.3 \
lua53 \
lua53-alt-getopt \
lua53-argparse \
lua53-loadkit \
lua53-lpeg \
lua53-luafilesystem \
update-alternatives"

inherit rpm
