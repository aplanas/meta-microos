SUMMARY = "Development files for ImGui"
DESCRIPTION = "ImGui is self-contained within a few files that you can easily copy and compile \
into your application/engine. \
 \
No specific build process is required. You can add the .cpp files to your \
project or #include them from an existing file."
LICENSE = "MIT"

PV = "1.89.5"

RPM_NAME = "imgui-devel-1.89.5-1.1.aarch64.rpm"
RPM_HASH = "abdbe5f46b3552d813d602c19a4b5c04dc1a8f811322b6c160dbf547d7b1219aed2f42acde7c4119127b3abb79616dee98ecd54b29e040a30102ce0cf9c45488"

RPROVIDES:${PN} += "imgui-devel \
imgui-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
