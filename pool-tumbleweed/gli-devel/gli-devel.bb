SUMMARY = "Header-only C++ image library for graphics software"
DESCRIPTION = "OpenGL Image (GLI) is a header only C++ image library for graphics software. \
 \
GLI provides classes and functions to load image files (KTX and DDS), \
facilitate graphics APIs texture creation, compare textures, access texture \
texels, sample textures, convert textures, generate mipmaps, etc. \
 \
This library works with OpenGL or Vulkan but also ensures \
interoperability with other third-party libraries and SDKs. It is a \
candidate for software rendering (raytracing / rasterisation), image \
processing, image-based software testing or any development context that \
requires an image library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.8.2.0"

RPM_NAME = "gli-devel-0.8.2.0-4.3.aarch64.rpm"
RPM_HASH = "29d72d7005c18dc336d67d27eef12fbcafbb77a49b68f659f87f875c31b229d62150032660bd58f3e9d31930a0a36a0f328e5f6571283ca5df72010b7981ef34"

RPROVIDES:${PN} += "cmake(gli) \
gli-devel \
gli-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
