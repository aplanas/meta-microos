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

RPM_NAME = "gli-devel-0.8.2.0-4.4.aarch64.rpm"
RPM_HASH = "9f953667c2cbf311a06d77c54b91a252c5303ff61bb74766428a9b3c246d06e4f8d826290562599dbc4054316973776510b4e67129cc6a5a0dff26bc3b1eb8eb"

RPROVIDES:${PN} += "cmake-gli \
gli-devel"

RDEPENDS:${PN} += ""

inherit rpm
