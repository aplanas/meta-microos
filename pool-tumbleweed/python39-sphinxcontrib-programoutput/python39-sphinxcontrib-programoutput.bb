SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.17"

RPM_NAME = "python39-sphinxcontrib-programoutput-0.17-2.8.noarch.rpm"
RPM_HASH = "133babd6c8cd3f3a51d12eb3eaadfe1b681a1bb468c5730eb6acc610edab54914b0600ec92f2043e093bfe0615806f41c99bd9aac32fcfe7a68b08322edf74b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-programoutput \
python39-sphinxcontrib-programoutput \
python3dist-sphinxcontrib-programoutput"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
