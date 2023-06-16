SUMMARY = "Python IDE based on Qt6"
DESCRIPTION = "Eric is a Python and Ruby editor and IDE, written in Python. It is \
based on the Qt GUI toolkit and integrates the Scintilla editor \
control."
LICENSE = "GPL-3.0-or-later"

PV = "23.4.2"

RPM_NAME = "eric-23.4.2-1.1.noarch.rpm"
RPM_HASH = "ca35df3fedc2518fe91b6851a1089e78d8c5b9c5703d375f51cd0e01649b9b6c4e450672b4ee64ba6543bce00f0d96304df08668d11508fb1a12355183b39897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eric \
eric5 \
eric6 \
python-eric5 \
python-eric6"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-EditorConfig \
python3-Pygments \
python3-asttokens \
python3-black \
python3-coverage \
python3-isort \
python3-jedi \
python3-packaging \
python3-parso \
python3-qscintilla-qt6 \
python3-qt6 \
python3-qtcharts-qt6 \
python3-qtwebengine-qt6 \
python3-semver \
python3-tomlkit \
python3-trove-classifiers \
python3-xml \
qt6-sql-sqlite"

inherit rpm
