SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua51-fluent-0.2.0-2.1.noarch.rpm"
RPM_HASH = "591b9699e8e1f4ead0533a5764b9bc468bc50f680db3117fa7ad566564f06a6790401d9731a2e37ba4a4addb105ca35d47dc36bb63a2516abcb009cce4092e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-fluent"

RDEPENDS:${PN} += "lua51 \
lua51-cldr \
lua51-luaepnf \
lua51-penlight"

inherit rpm
