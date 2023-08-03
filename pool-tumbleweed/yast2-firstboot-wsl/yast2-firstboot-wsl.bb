SUMMARY = "YaST2 firstboot settings for WSL images"
DESCRIPTION = "YaST2 firstboot settings for WSL images"
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-firstboot-wsl-4.6.1-1.1.noarch.rpm"
RPM_HASH = "222b21ad01e6d204b7bae7be0b5e910d89231824306479364655313a7dbb4618d03458352f43b5ae17032fb065c86bab1f24ef44f1c0f465a9a7b3d7cc6b0d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-firstboot-wsl"

RDEPENDS:${PN} += "/usr/bin/sh \
yast2-firstboot"

inherit rpm
