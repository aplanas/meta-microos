SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python311-sphinxcontrib-websupport-1.2.4-4.3.noarch.rpm"
RPM_HASH = "9fcd65772cdac6f2941dd72ab5657061f765b29becfe731112bd36160f37363e964af4844b6eaae1f84b5d143e7b4c0cdfb189de75e0164b4ddb7043efd377aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-websupport \
python3.11dist-sphinxcontrib-websupport \
python311-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-docutils"

inherit rpm
