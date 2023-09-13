SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python310-sphinxcontrib-websupport-1.2.6-1.1.noarch.rpm"
RPM_HASH = "015c14487f585a9132f2892e4d993ffbd3255f0f50a9ce369895f87fb461f0e6f277d21803d5f53961c67cface0d6135b082fc00276e96331a63966de1d698b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-websupport \
python310-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-docutils"

inherit rpm
