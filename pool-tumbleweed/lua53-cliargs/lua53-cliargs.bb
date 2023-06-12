SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.02"

RPM_NAME = "lua53-cliargs-3.02-5.2.noarch.rpm"
RPM_HASH = "99bdc1c867c55221acdd38cbbfd2edd824fb8c3865967ede34fb4eb68e805088f64105f47abdc99a8eafac8716474a322616bcc444b68ad9ca0714574dd4e498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cliargs"
RDEPENDS:${PN} += "lua53"

inherit rpm
