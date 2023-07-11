SUMMARY = "Python IDE based on Qt6"
DESCRIPTION = "Eric is a Python and Ruby editor and IDE, written in Python. It is \
based on the Qt GUI toolkit and integrates the Scintilla editor \
control."
LICENSE = "GPL-3.0-or-later"

PV = "23.4.2"

RPM_NAME = "eric-23.4.2-1.2.noarch.rpm"
RPM_HASH = "28e2fc09166db30edfaee2c1155a78c8b4fd5c28b5837c65d216e3bfb13ca6c4c717ddb0263670e0838f19a0bb9c42c2ac51e57157a612f2b3fd0d959b6e403f"
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
