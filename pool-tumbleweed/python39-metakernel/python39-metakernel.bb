SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.4"

RPM_NAME = "python39-metakernel-0.29.4-1.3.noarch.rpm"
RPM_HASH = "61feb27e97a7089e08909d43715001848b36a1813c345495f2800ad0a7a0f75979292a41bc7ac4885521ed3d08e196a2e69c7dc3ecc57d298b0eb611013b8511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(metakernel) \
python39-jupyter_metakernel \
python39-metakernel \
python3dist(metakernel)"
RDEPENDS:${PN} += "python(abi) \
python39-ipykernel \
python39-jedi \
python39-jupyter-core \
python39-pexpect"

inherit rpm
