SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python310-sphinxcontrib-websupport-1.2.4-4.3.noarch.rpm"
RPM_HASH = "3df68d12185235ef4b5dc5795c2b2eb44ed1d6126ca2b9f85f8418d0da15bbf168e0d265a9f5499d749b5a25bff727957dfa88082bab416146c973a7ec2067e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-websupport \
python310-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-docutils"

inherit rpm
