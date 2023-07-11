SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python39-sphinxcontrib-autoprogram-doc-0.1.8-2.3.noarch.rpm"
RPM_HASH = "0abfdfcc4628da358a3e865b8b307997b77f496d77dc52c18fd8d370377d0140b30a357fed1d58caf53d424db5f20071c8a0fae9b76cbfe554d35f4d48513bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sphinxcontrib-autoprogram-doc"

RDEPENDS:${PN} += "python39-Sphinx"

inherit rpm
