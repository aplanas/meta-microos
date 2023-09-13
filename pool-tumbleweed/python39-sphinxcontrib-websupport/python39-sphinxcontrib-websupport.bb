SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python39-sphinxcontrib-websupport-1.2.6-1.1.noarch.rpm"
RPM_HASH = "2655fa2ba46a320e108fd0444315a2689f81dd4bc4cdda46996f3da3daae0d0561469ea6cf556e4e8103525beb05fe8b09f514360af39e7b6e0f168c9005af7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-websupport \
python39-sphinxcontrib-websupport \
python3dist-sphinxcontrib-websupport"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-docutils"

inherit rpm
