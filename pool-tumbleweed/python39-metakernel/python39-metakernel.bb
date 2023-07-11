SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.4"

RPM_NAME = "python39-metakernel-0.29.4-1.5.noarch.rpm"
RPM_HASH = "616ba3c052eae3eafac34aeae30d4cd87d2dc2c0cf8244aa5ab89d74694bb2cf99e65e0c44866d915a924613bcc23d8bdff2a514f59029af92c7bc916a1f2730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-metakernel \
python39-jupyter-metakernel \
python39-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python39-ipykernel \
python39-jedi \
python39-jupyter-core \
python39-pexpect"

inherit rpm
