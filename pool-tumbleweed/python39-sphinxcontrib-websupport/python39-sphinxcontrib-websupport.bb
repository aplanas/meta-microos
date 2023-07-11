SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python39-sphinxcontrib-websupport-1.2.4-4.3.noarch.rpm"
RPM_HASH = "f079688d19cf876f63e029533530c280a39e5c489e2fdced76d3c8b858a5f68b0001695ba88e60b662c1b58dc8916ba9de1d556dc02148018783b2d15fcfaf5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-websupport \
python39-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-docutils"

inherit rpm
