SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-jupyter-kernel-test-0.5.0-1.5.noarch.rpm"
RPM_HASH = "b5ae231e0fdd6d1c50d86bf48e85087e0c2fbfa780f6e7a7b0a5f8b6b0fa5460e71bb19fc6dbe33a9d39c2604cceb3dc4d63daf6f16751b6b776261804a86678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-kernel-test \
python3.11dist-jupyter-kernel-test \
python311-jupyter-kernel-test \
python3dist-jupyter-kernel-test"

RDEPENDS:${PN} += "python-abi \
python311-jsonschema \
python311-jupyter-client"

inherit rpm
