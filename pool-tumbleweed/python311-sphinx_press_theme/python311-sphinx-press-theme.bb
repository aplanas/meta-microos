SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-sphinx_press_theme-0.8.0-1.3.noarch.rpm"
RPM_HASH = "a6deac2cf9e4e2b9856738b247d6494bf4a9b3c329ff112f24b782ff44e1dc61eee53201e21aacdba55766780b41a22da6f0ed8ae2c21b3989da725ee35e0572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-press-theme \
python311-sphinx-press-theme \
python3dist-sphinx-press-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
