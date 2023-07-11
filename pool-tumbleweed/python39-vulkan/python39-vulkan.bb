SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.1.99.1"

RPM_NAME = "python39-vulkan-1.1.99.1-1.17.noarch.rpm"
RPM_HASH = "090d2db2163589dcb3226d0aaa5a37d3f7e54ee2caab3371129c52f6c156c432079cc0ee45de20ee179495996c1c88fe2fc1bf04d93cf8a4b9221841b774eee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vulkan \
python39-vulkan \
python3dist-vulkan"

RDEPENDS:${PN} += "python-abi \
python39-cffi \
vulkan"

inherit rpm
