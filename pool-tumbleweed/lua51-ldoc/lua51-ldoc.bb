SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "lua51-ldoc-1.4.6-6.2.noarch.rpm"
RPM_HASH = "a4d288104d5ecf5eed53feac74191f04cd26e59b65f131b9c0425f4edbd451303c78938300246a96f55326ea89d20514c997bdc58d98c30a51ea62bb459198e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-ldoc"

RDEPENDS:${PN} += "lua51"

inherit rpm
