SUMMARY = "Lightweight Java Game Library 3"
DESCRIPTION = "LWJGL is a Java library that enables cross-platform access to popular native APIs \
useful in the development of graphics (OpenGL, Vulkan), audio (OpenAL), parallel \
computing (OpenCL, CUDA) and XR (OpenVR, LibOVR) applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "lwjgl3-3.2.3-1.15.noarch.rpm"
RPM_HASH = "d1fef5778cfbcbbe37ed0c23695fb95129e39d6a658afb5daaa784379985cd3f4210950869b6e53470a4f5246d1ab4c3070257d015b2cfb6bcf877354fffaff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lwjgl3 \
mvn-org.lwjgl-lwjgl \
mvn-org.lwjgl-lwjgl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
