SUMMARY = "Documentation tool for GObject-based libraries"
DESCRIPTION = "Documentation tool for GObject-based libraries"
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC0-1.0"

PV = "2023.1"

RPM_NAME = "python3-gi-docgen-2023.1-1.1.noarch.rpm"
RPM_HASH = "b07beb4c4865f9495671f58b992787cf753c7dd79980c3faeaf99fde977926c7223fb4bf474a10f8f441ebdac613a7f48ade7ed532eb6a171245d7530a6a1ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-gi-docgen \
python3-gi-docgen \
python3.10dist-gi-docgen \
python3dist-gi-docgen"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Jinja2 \
python3-Markdown \
python3-MarkupSafe \
python3-Pygments \
python3-toml \
python3-typogrify"

inherit rpm
