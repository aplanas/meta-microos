SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-sphinx_press_theme-0.8.0-1.5.noarch.rpm"
RPM_HASH = "c7dbeb86ab33778fc31f2b5b5b278723da2d9b314479fa550ee9e983af806c19789cce55da59834a9a62396a8f4c678659c858c0c1a983fff5e7c26c4f65909d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-press-theme \
python39-sphinx-press-theme \
python3dist-sphinx-press-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
