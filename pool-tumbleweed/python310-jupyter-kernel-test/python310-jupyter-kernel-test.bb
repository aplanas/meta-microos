SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-jupyter-kernel-test-0.5.0-1.3.noarch.rpm"
RPM_HASH = "e73b554904e16af46ea56b659f35f7788f6ada440b16bfa5a68d7c06b4ade7a6ec80b35b0d00e5deacf311e4a721aeff58c7fee481e3b16f17ce30625ae9819b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-kernel-test \
python3-jupyter_kernel_test \
python3.10dist(jupyter-kernel-test) \
python310-jupyter-kernel-test \
python310-jupyter_kernel_test \
python3dist(jupyter-kernel-test)"
RDEPENDS:${PN} += "python(abi) \
python310-jsonschema \
python310-jupyter_client"

inherit rpm
