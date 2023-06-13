SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "lua53-ldoc-1.4.6-6.2.noarch.rpm"
RPM_HASH = "e60b512cd6935563a414d8f3331e70744e84d3281329e7989b2940cbe408f58d23856bda296b453ff77029a8feea0977f89c4e7f44bcab6294150e9f7a368281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-ldoc"

RDEPENDS:${PN} += "lua53"

inherit rpm
