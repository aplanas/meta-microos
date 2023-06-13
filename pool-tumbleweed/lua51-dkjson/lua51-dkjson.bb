SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It \
supports UTF-8. \
 \
JSON (JavaScript Object Notation) is a format for serializing \
data based on the syntax for JavaScript data structures. \
 \
dkjson is written in Lua without any dependencies, but \
when LPeg is available dkjson can use it to speed up decoding."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "lua51-dkjson-2.5.2-5.2.noarch.rpm"
RPM_HASH = "1d3ed983ad4c6139374d906ad5881a8aa2cdfced0e1d3fb4a3299d84afc53024acec64ee30cb1c337259f069743fbc4a785bea64eda331d27e8e10ff94304e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-dkjson"

RDEPENDS:${PN} += "lua51 \
lua51-lpeg"

inherit rpm
