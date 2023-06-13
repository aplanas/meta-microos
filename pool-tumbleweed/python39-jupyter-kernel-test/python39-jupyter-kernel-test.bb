SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-jupyter-kernel-test-0.5.0-1.3.noarch.rpm"
RPM_HASH = "4f5046214e711a12d975a84f6fe2ee6e2e6e8df3d3fe8cab7d328b95762372c8d3bfcf8e0aedb3bc0149f800566a0cb9b1298029c6dcaff236c4ee15de938420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-kernel-test) \
python39-jupyter-kernel-test \
python39-jupyter_kernel_test \
python3dist(jupyter-kernel-test)"

RDEPENDS:${PN} += "python(abi) \
python39-jsonschema \
python39-jupyter_client"

inherit rpm
