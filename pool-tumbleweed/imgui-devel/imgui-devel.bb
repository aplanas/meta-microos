SUMMARY = "Development files for ImGui"
DESCRIPTION = "ImGui is self-contained within a few files that you can easily copy and compile \
into your application/engine. \
 \
No specific build process is required. You can add the .cpp files to your \
project or #include them from an existing file."
LICENSE = "MIT"

PV = "1.89.6"

RPM_NAME = "imgui-devel-1.89.6-1.1.aarch64.rpm"
RPM_HASH = "65ea29e9fef49a0e69b7665dbd95d67c898b9ac6e4b15aee21ee9f0c25334b34c71abca8dce3b77334c3d3ebad58d46465ff4a12c34c65620c547ba6f169a366"

RPROVIDES:${PN} += "imgui-devel"

RDEPENDS:${PN} += ""

inherit rpm
