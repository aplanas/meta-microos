SUMMARY = "Documentation on luaposix"
DESCRIPTION = "This package contains the documentation for lua54-luaposix."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "luaposix-doc-35.1-2.2.noarch.rpm"
RPM_HASH = "bf14efeb1d9666c23dfe24546f045133409b74d651d4a5846ed2a4ae929b697b5ff4194a279e609a8e61aaa2e49fccc4ed6778ec4bd601d45923de2d37d6ba05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luaposix-doc"

RDEPENDS:${PN} += ""

inherit rpm
