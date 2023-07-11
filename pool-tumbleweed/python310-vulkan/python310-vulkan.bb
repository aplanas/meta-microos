SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.1.99.1"

RPM_NAME = "python310-vulkan-1.1.99.1-1.17.noarch.rpm"
RPM_HASH = "59e59fc5959372e2a0cf110f9920c1f451d9726fd79daa897002017c01960e978103692bf4f3e3e5c66a2bbfe4961704395338815815ccf05fb7e192a43df578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vulkan \
python310-vulkan \
python3dist-vulkan"

RDEPENDS:${PN} += "python-abi \
python310-cffi \
vulkan"

inherit rpm
