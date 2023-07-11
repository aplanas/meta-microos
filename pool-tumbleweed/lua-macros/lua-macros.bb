SUMMARY = "Macros for lua language"
DESCRIPTION = "RPM macros for lua packaging"
LICENSE = "MIT"

PV = "20210827"

RPM_NAME = "lua-macros-20210827-3.4.noarch.rpm"
RPM_HASH = "54ca9a1d99eb697a3cfed722309c1d68f2992ec08b19bb1530d2a58964a4149f6730d04b282440e4cbeaf2a14b91b43d50d5648c6b06b29b6153a8fc409f6807"
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
