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

RPM_NAME = "lua53-shell-games-1.1.0-2.1.noarch.rpm"
RPM_HASH = "f4c2403cfa3048a9c06174f9a35da96e696aa47e84414a3da1c2ed67302903d719f2eb04658290fb83fc4fc7665145e0f85500412ed2e8f7391eb74d1f415a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-shell-games"

RDEPENDS:${PN} += "lua53"

inherit rpm
