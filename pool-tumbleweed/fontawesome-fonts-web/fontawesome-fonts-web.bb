SUMMARY = "Web files for font-awesome"
DESCRIPTION = "Web files (css, less, scss, etc) for font-awesome."
LICENSE = "MIT"

PV = "6.4.2"

RPM_NAME = "fontawesome-fonts-web-6.4.2-1.1.noarch.rpm"
RPM_HASH = "cb497a51ae6ddd768e4aa090de02b4b62853b1f5c364ee26e5ce67c0b33a6b9d8e4adef50a2033f5d7ed0a0bc7bb5f28283d373715107e612fdeb7cffbaa35ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontawesome-fonts-web"

RDEPENDS:${PN} += ""

inherit rpm
