SUMMARY = "ALSA UCM Profiles"
DESCRIPTION = "This package contains the profiles files for ALSA UCM (Use Case Manager)."
LICENSE = "BSD-3-Clause"

PV = "1.2.10"

RPM_NAME = "alsa-ucm-conf-1.2.10-1.1.noarch.rpm"
RPM_HASH = "e836abf342c2d3e6189b132aa9c3ad41ae4780145312a528baee8ef54a5e958b941e2cd1744c8b5b32a49d344f9ab39dcde637db49bf0938236c349565248b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-ucm-conf"

RDEPENDS:${PN} += "libasound2"

inherit rpm
