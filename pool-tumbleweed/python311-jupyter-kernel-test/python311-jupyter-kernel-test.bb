SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-jupyter-kernel-test-0.5.0-1.3.noarch.rpm"
RPM_HASH = "f407c7162518a4a82ccee9ba30560450cf21f2247ef66e3dc6c71932313b6945821b5e0e2def8431f70f7f0e60b4f6d31a30366931351573a3ed8ce50dd34938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-kernel-test \
python311-jupyter-kernel-test \
python3dist-jupyter-kernel-test"

RDEPENDS:${PN} += "python-abi \
python311-jsonschema \
python311-jupyter-client"

inherit rpm
