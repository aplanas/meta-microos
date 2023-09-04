SUMMARY = "Development files for renderdoc"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.28"

RPM_NAME = "renderdoc-devel-1.28-1.1.aarch64.rpm"
RPM_HASH = "7eb4b9f02f25742fce96d8fbbcfcd2839d3d9cf1b36ceb854467d4000b5d8803942d534201d693379528007800b96439e99736b3d122f6b43776a1ada2af5831"

RPROVIDES:${PN} += "renderdoc-devel"

RDEPENDS:${PN} += "renderdoc"

inherit rpm
