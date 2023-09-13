SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python311-sphinxcontrib-websupport-1.2.6-1.1.noarch.rpm"
RPM_HASH = "526a6ef82c9ed98850f06664231d7f91d7be712970cf9c014fb1cda3b0b65844ba585b2b03e018df4d93a0f802e73d4eabd50d69e27830fa751057604a1f0c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-websupport \
python3.11dist-sphinxcontrib-websupport \
python311-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-docutils"

inherit rpm
