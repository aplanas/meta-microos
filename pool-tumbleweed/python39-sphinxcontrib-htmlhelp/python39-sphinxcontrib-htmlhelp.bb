SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python39-sphinxcontrib-htmlhelp-2.0.1-2.3.noarch.rpm"
RPM_HASH = "13646df213336993b4d5457746982d74c4ea1129f1d8f29d2841dc29a05282866d6c054b24e6f27654ca0f9e7fc7d7ae013ea136bdc00c0024b0578c8220c7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-htmlhelp \
python39-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
