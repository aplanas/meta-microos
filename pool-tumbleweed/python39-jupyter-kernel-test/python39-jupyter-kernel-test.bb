SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-jupyter-kernel-test-0.5.0-1.5.noarch.rpm"
RPM_HASH = "f8a91b136bc419ae4919a32e9bf7b6d4e10ec01f710f9b418294f0c0278c787eca7fefe8ccef685265eea98accc52821eee17e082367e2d63a654ca4db4fb101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-kernel-test \
python39-jupyter-kernel-test \
python3dist-jupyter-kernel-test"

RDEPENDS:${PN} += "python-abi \
python39-jsonschema \
python39-jupyter-client"

inherit rpm
