SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.17"

RPM_NAME = "python311-sphinxcontrib-programoutput-0.17-2.10.noarch.rpm"
RPM_HASH = "ff8b5d38b6f090d74b0588cb674d3f8fd41fe8a8c9c48b3cd340ae40d63136a4a9b5db4ef5302f75c569eaca45a8e09d0e34282721522c87acf3dadb0ffba756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-programoutput \
python3.11dist-sphinxcontrib-programoutput \
python311-sphinxcontrib-programoutput \
python3dist-sphinxcontrib-programoutput"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
