SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-sphinx_press_theme-0.8.0-1.3.noarch.rpm"
RPM_HASH = "13a2fbc864b30e2c34a03c344c5e3dde0c0938486e08aa8f83decb7fadca12f01f628d5fedadae4965b457e24b5207b1d5b9fee89bb5903e0cbed4aac05f4614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-press-theme) \
python39-sphinx_press_theme \
python3dist(sphinx-press-theme)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
