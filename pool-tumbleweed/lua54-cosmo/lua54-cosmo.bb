SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "lua54-cosmo-16.06.04-2.1.noarch.rpm"
RPM_HASH = "f154d4ca9e64ce9d59ad8bf30876a8c6d3afb838376d115529faee763eca3ac45b3d4524b7d678115b078077c60c72abe10dee0fdced027341717faa721a7a64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-cosmo \
lua54-cosmo"
RDEPENDS:${PN} += "lua54 \
lua54-lpeg"

inherit rpm
