SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "lua53-mediator_lua-1.120-4.2.noarch.rpm"
RPM_HASH = "6555ae1e33df6daf36030c9a8192e0850d37b17695156b3a928b8e3952f6c8e7d42ab4373cbc916e42980ac3af7a99a9ca4cd38cdc22e7bd618e9ee4f5c20ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-mediator_lua"
RDEPENDS:${PN} += "lua53"

inherit rpm
