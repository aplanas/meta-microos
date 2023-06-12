SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "lua53-messagepack-0.5.2-2.1.noarch.rpm"
RPM_HASH = "471817ed688949d48ca59aa201054329e311669974f588cfe0dd8e88c9783f4f9e8f38afde02df4b214c8119a098f93188cf0a62d9156546c93a77b3f90a4d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-messagepack"
RDEPENDS:${PN} += "lua53"

inherit rpm
