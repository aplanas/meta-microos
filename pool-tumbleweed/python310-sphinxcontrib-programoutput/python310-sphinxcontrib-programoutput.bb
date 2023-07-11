SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.17"

RPM_NAME = "python310-sphinxcontrib-programoutput-0.17-2.10.noarch.rpm"
RPM_HASH = "dd9ba1289c7a8595db96ed4405281764857d7d4fa3d11199447dd030e91834cdbf0fc8d3d66e90d50daeb52f81bc921338f039372cdecfa079bfcacd1d61a6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-programoutput \
python310-sphinxcontrib-programoutput \
python3dist-sphinxcontrib-programoutput"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
