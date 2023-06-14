SUMMARY = "Lightweight Java Game Library 3"
DESCRIPTION = "LWJGL is a Java library that enables cross-platform access to popular native APIs \
useful in the development of graphics (OpenGL, Vulkan), audio (OpenAL), parallel \
computing (OpenCL, CUDA) and XR (OpenVR, LibOVR) applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "lwjgl3-3.2.3-1.14.noarch.rpm"
RPM_HASH = "14eebd7b0c4664e7db8df70482e707ab464474230127bd45748212b84d0cb601780b5b051ab2654835f5f97c5b994fd2b138b6e858bc311b5fcc5172840cf64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lwjgl3 \
mvn-org.lwjgl-lwjgl \
mvn-org.lwjgl-lwjgl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
