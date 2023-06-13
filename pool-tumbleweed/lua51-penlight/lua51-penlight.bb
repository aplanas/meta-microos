SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "lua51-penlight-1.13.1-2.2.noarch.rpm"
RPM_HASH = "e08c50642948142b7db0bdfce21e81f6525b37d4759bdcd463dfdab694b3ede82dfa3fd26cfaf4c6b9762841a19f52d87eba5b730da546c113cb200c6de5a73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-penlight"

RDEPENDS:${PN} += "lua51 \
lua51-luafilesystem"

inherit rpm
