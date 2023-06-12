SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.1.99.1"

RPM_NAME = "python39-vulkan-1.1.99.1-1.15.noarch.rpm"
RPM_HASH = "a17b5499ebba21a64edcd6e2da33b34e073611295f1c9c7cd83779ac3a7e53894cbb276890fdc8f0086becb74e7df2a6d7503f2a5c6c70db83a1e689f7724af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vulkan) \
python39-vulkan \
python3dist(vulkan)"
RDEPENDS:${PN} += "python(abi) \
python39-cffi \
vulkan"

inherit rpm
