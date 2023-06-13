SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "This package provides a set of analysis plugins for use with \
setroubleshoot. Each plugin has the capacity to analyze SELinux AVC \
data and system data to provide user friendly reports describing how \
to interpret SELinux AVC denials."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.14"

RPM_NAME = "setroubleshoot-plugins-3.3.14-1.2.noarch.rpm"
RPM_HASH = "c92209bfc1afed096c52808649dd1f73a9d72ebf10cd12dd9187bd9fa4c2625760cda36fbff3b4432b7d2e6d3500be6d75e26679898881bf7ab4f5972a31ab0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-plugins"

RDEPENDS:${PN} += "setroubleshoot-server"

inherit rpm
