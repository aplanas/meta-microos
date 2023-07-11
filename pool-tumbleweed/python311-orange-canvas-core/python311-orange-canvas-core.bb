SUMMARY = "Core component of Orange Canvas"
DESCRIPTION = "Core component of Orange Canvas"
LICENSE = "GPL-3.0-only"

PV = "0.1.18"

RPM_NAME = "python311-orange-canvas-core-0.1.18-1.14.noarch.rpm"
RPM_HASH = "e6e3a812b448988beb134904d8efce26c4ee03d183e85865179b375f3fb81bf31b59af3279224625c3b17cc2b9fb09a1e09f21f8b084496ac59a63343de5934f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-orange-canvas-core"

RDEPENDS:${PN} += "python311-AnyQt \
python311-CacheControl \
python311-commonmark \
python311-dictdiffer \
python311-docutils \
python311-qt5 \
python311-requests"

inherit rpm
