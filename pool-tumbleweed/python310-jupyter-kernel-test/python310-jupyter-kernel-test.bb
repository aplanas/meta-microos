SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-jupyter-kernel-test-0.5.0-1.5.noarch.rpm"
RPM_HASH = "c492dbb984634533159279b1574a781848cc3893a639d289978dc9987fd3d33c0c2361a059347d2e70c48a4374758137a46c1dbc8d007452700cac04b7fcd965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-kernel-test \
python310-jupyter-kernel-test \
python3dist-jupyter-kernel-test"

RDEPENDS:${PN} += "python-abi \
python310-jsonschema \
python310-jupyter-client"

inherit rpm
