SUMMARY = "YaST2 firstboot settings for WSL images"
DESCRIPTION = "YaST2 firstboot settings for WSL images"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-firstboot-wsl-4.6.0-1.1.noarch.rpm"
RPM_HASH = "092fbbe9e6e902a083e7382d86435f8ff096b924eb9cd02efb6faf591be3af89e7744e9c67a888c7d43a6cf84160a739c7efe700f1180d9da1b56c92c2207adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-firstboot-wsl"

RDEPENDS:${PN} += "/bin/sh \
yast2-firstboot"

inherit rpm
