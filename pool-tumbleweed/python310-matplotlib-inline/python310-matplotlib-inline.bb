SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python310-matplotlib-inline-0.1.6-2.1.noarch.rpm"
RPM_HASH = "125ce5b86deb3b51c707c9e728f1278edbfc13fc4f463a3a6b7ec7cde3f7c2c51fd2585a85050ef2933f38cc6b8d7e3e2c23ca4de8c1827b51eee30f039ce42c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-matplotlib-inline \
python310-matplotlib-inline \
python3dist-matplotlib-inline"

RDEPENDS:${PN} += "python-abi \
python310-traitlets"

inherit rpm
