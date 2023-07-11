SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pydata-sphinx-theme-0.13.1-2.2.noarch.rpm"
RPM_HASH = "df67dde281e46dec8a09b7ee7dba6598f5b4bf2fa56ed73a81509ccc93840de6ff20ad2fdb20e348d739e1a4d70ad322a1b7baa84e4bf31ef870f45c00f3ee5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-sphinx-theme \
python3.11dist-pydata-sphinx-theme \
python311-pydata-sphinx-theme \
python3dist-pydata-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-beautifulsoup4 \
python311-docutils \
python311-sphinx-theme-builder"

inherit rpm
