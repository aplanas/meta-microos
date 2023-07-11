SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.17"

RPM_NAME = "python39-sphinxcontrib-programoutput-0.17-2.10.noarch.rpm"
RPM_HASH = "593ad0d292be7db10b3a2d7e2b77cc48dad670a5a6f89ccae8bef4ac00fab8b87e6f9163204e05579b5650a047082bc8152f575f4f762ca352a2b04fb78a6579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-programoutput \
python39-sphinxcontrib-programoutput \
python3dist-sphinxcontrib-programoutput"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
