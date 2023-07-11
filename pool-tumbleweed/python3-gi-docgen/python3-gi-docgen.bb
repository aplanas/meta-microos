SUMMARY = "Documentation tool for GObject-based libraries"
DESCRIPTION = "Documentation tool for GObject-based libraries"
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC0-1.0"

PV = "2023.1"

RPM_NAME = "python3-gi-docgen-2023.1-1.2.noarch.rpm"
RPM_HASH = "08c6a22b5efa7bbfe3c230bc5d21855f57dfb328229acaec565b47e066f7525f635b5558ee56c0b389523a97af5c9c9b1389247700db0baa4ee2d7240afc6fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-gi-docgen \
python3-gi-docgen \
python3.11dist-gi-docgen \
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
