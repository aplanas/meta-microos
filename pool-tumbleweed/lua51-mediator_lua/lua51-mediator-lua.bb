SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "lua51-mediator_lua-1.120-4.2.noarch.rpm"
RPM_HASH = "e5b9bece01b7a9b23d0c548f1d6fbef80a1d42cd1751ba56e9fb692cfcc600a603e973b10f1881a0964913abd251a4d7db9bf077537925e1c860c1c3f0752ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-mediator_lua"
RDEPENDS:${PN} += "lua51"

inherit rpm
