SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-sphinx_press_theme-0.8.0-1.5.noarch.rpm"
RPM_HASH = "79918b2c295478d1ac67870acccfb554cba896b13c64f50cff772831ebcf31c2a64ce5f5da2eb5869aee2cb01f28b9b81042418b3916a5dd6b8af4ce69ee7d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-press-theme \
python3.11dist-sphinx-press-theme \
python311-sphinx-press-theme \
python3dist-sphinx-press-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
