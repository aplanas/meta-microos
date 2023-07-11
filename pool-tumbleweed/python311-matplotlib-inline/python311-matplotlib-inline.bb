SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python311-matplotlib-inline-0.1.6-2.1.noarch.rpm"
RPM_HASH = "3296a4f1c5ad02cd21952b2e2608e8fe2b24a22b55e512f6182102c9344d1f23cdf0a0ae3f7b7805e1ae32e286861de0d90e0ebfc11d8cadc3cbfd24c70fc4ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matplotlib-inline \
python3.11dist-matplotlib-inline \
python311-matplotlib-inline \
python3dist-matplotlib-inline"

RDEPENDS:${PN} += "python-abi \
python311-traitlets"

inherit rpm
