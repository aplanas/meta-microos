SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "lua53-alt-getopt-0.8.1-4.2.noarch.rpm"
RPM_HASH = "ba2118febdcbf9a24df5e21e6e943785ddab851f16e0682c371eb6537d698a7cfdf30d9f5315f98a1d2bf4ed2099317288d32041fc3e7f3f0419860c726deef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-alt-getopt"
RDEPENDS:${PN} += "lua53"

inherit rpm
