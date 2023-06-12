SUMMARY = "Lua library to help execute shell commands"
DESCRIPTION = "A Lua library to help execute shell commands more easily and safely. \
 \
* Easily execute shell commands, while capturing the command's output and exit \
code. Includes compatibility across versions of Lua, LuaJIT, and OpenResty \
where io.popen may not return exit codes (pre Lua 5.2 behavior). \
* Utilities to quote and escape shell arguments for safer, less error-prone \
execution. \
 \
When executing shell commands, shell-games wraps either os.execute or io.popen \
(depending on whether the output is being captured)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua54-shell-games-1.1.0-2.1.noarch.rpm"
RPM_HASH = "a162ee371e759240d5a30de5dbb3b128ef29f77be91e0a9d2d620ad15e5378a0d0b53a8b4f29e61e63f3adea931315e317f72e0165092819e19034b32d60b7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-shell-games \
lua54-shell-games"
RDEPENDS:${PN} += "lua54"

inherit rpm
