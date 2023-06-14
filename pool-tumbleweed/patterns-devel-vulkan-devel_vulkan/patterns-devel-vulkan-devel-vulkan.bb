SUMMARY = "Vulkan Development"
DESCRIPTION = "Tools and libraries for software development using Vulkan."
LICENSE = "MIT"

PV = "20221115"

RPM_NAME = "patterns-devel-vulkan-devel_vulkan-20221115-2.2.aarch64.rpm"
RPM_HASH = "f49a99590a5b3f3ee5b0504bd58212c56fb82a884e3c583cbbec0135371a4e34cdafb96dd8669b30a95e8e2fa15562b4df376b3248f9feba81996efdf619c0c8"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-vulkan-devel-vulkan"

RDEPENDS:${PN} += ""

inherit rpm
