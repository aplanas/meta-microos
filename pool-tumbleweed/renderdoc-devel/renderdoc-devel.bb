SUMMARY = "Development files for renderdoc"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.27"

RPM_NAME = "renderdoc-devel-1.27-1.2.aarch64.rpm"
RPM_HASH = "3f74c8da72590133da2ef97219f7ba725a074b021dcaaab39d740da09b51649b2e553b86709578b2ccf678be07e45b47346a2554240f7732c5130af482516639"

RPROVIDES:${PN} += "renderdoc-devel"

RDEPENDS:${PN} += "renderdoc"

inherit rpm
