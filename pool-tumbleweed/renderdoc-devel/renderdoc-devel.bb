SUMMARY = "Development files for renderdoc"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.26"

RPM_NAME = "renderdoc-devel-1.26-1.1.aarch64.rpm"
RPM_HASH = "b7eaaf5011fa5c6d26ca4b04a20c0403f080cc3ab26bf9c72e3588f65a813221652fa2cf36bbab76104ee864e53a95334cd926c169a5552314bebfce77a45e5f"

RPROVIDES:${PN} += "renderdoc-devel \
renderdoc-devel(aarch-64)"

RDEPENDS:${PN} += "renderdoc"

inherit rpm
