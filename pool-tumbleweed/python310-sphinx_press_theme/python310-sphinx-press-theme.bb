SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-sphinx_press_theme-0.8.0-1.5.noarch.rpm"
RPM_HASH = "cfd20fd946397f89cb69fda3ded7318987501b631612b83b340f92d015a16f799614439958add2a520e94e2e192d9daecae65b44fdebb9cc06edd76f42cb1548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-press-theme \
python310-sphinx-press-theme \
python3dist-sphinx-press-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
