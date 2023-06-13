SUMMARY = "Documentation for lua51-luasocket"
DESCRIPTION = "This subpackage contains documentation for lua51-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua51-luasocket-doc-3.1.0-2.2.noarch.rpm"
RPM_HASH = "e41d3d00a6388a8bcd64e8ebdd7a3cc4011dcafa3a40af6fc30c1da539bb591d2149c45920f31078597666ccb8fd850b15de179c423ea1a75771e92a44cc8696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-luasocket-doc"

RDEPENDS:${PN} += ""

inherit rpm
