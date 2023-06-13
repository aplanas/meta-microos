SUMMARY = "OpenCL (Open Computing Language) headers"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides the official Khronos Group OpenCL headers needed to \
compile programs that use OpenCL."
LICENSE = "MIT"

PV = "2023.04.17"

RPM_NAME = "opencl-headers-2023.04.17-1.1.noarch.rpm"
RPM_HASH = "d384faf018e7fa3b7f2d0f05654aa5d06a51c68982fbbc3453aef0510eaa31cdfa8ed25171b17c2c1f17c3a9d519b2a49d18de762dad8155ae438bdc590ab341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(OpenCLHeaders) \
opencl-headers \
pkgconfig(OpenCL-Headers)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
