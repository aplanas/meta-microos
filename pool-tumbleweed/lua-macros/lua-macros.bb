SUMMARY = "Macros for lua language"
DESCRIPTION = "RPM macros for lua packaging"
LICENSE = "MIT"

PV = "20210827"

RPM_NAME = "lua-macros-20210827-3.3.noarch.rpm"
RPM_HASH = "917528ca93decc0ce4ee9310de5d71fbd328b99c2e847f49c20fff3ec582954cd0c0d28f065a1569b92ea2ce1147b1edb4e5d204e9f25061414c3f2f931d8061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-macros \
rpm-macro-ifluadefault \
rpm-macro-lua-archdir \
rpm-macro-lua-incdir \
rpm-macro-lua-noarchdir \
rpm-macro-lua-provides \
rpm-macro-lua-version \
rpm-macro-lua-version-default \
rpm-macro-lua-version-default-nodots \
rpm-macro-lua-version-nodots \
rpm-macro-luarocks-build \
rpm-macro-luarocks-install \
rpm-macro-luarocks-treedir"

RDEPENDS:${PN} += "lua"

inherit rpm
