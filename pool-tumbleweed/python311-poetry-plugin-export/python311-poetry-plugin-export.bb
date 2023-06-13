SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-poetry-plugin-export-1.4.0-1.1.noarch.rpm"
RPM_HASH = "5525138f6cfbc55e581f460ffbd6fe00be46529550a747bdf9e15213c83b6e1046c8202fdab658fb2596d4281efc6c43ccd7c1d7dc3dbc45770a8697f8a398d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poetry-plugin-export) \
python311-poetry-plugin-export \
python311-poetry_plugin_export \
python3dist(poetry-plugin-export)"

RDEPENDS:${PN} += "python(abi) \
python311-poetry \
python311-poetry-core"

inherit rpm
