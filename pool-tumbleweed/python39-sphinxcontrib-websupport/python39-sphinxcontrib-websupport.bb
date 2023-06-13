SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python39-sphinxcontrib-websupport-1.2.4-4.1.noarch.rpm"
RPM_HASH = "97e8dcf5b13257a1f016c4a7e4c23c43cf5bf691adb916accad239e68c1ee79ad31ec52a8404b33b56c6efa34fd8ed33397ffd72d0d4ed6065de4e5ffd0a5301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-websupport) \
python39-sphinxcontrib-websupport \
python3dist(sphinxcontrib-websupport)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-docutils"

inherit rpm
