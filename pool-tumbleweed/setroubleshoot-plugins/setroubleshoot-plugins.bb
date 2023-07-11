SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "This package provides a set of analysis plugins for use with \
setroubleshoot. Each plugin has the capacity to analyze SELinux AVC \
data and system data to provide user friendly reports describing how \
to interpret SELinux AVC denials."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.14"

RPM_NAME = "setroubleshoot-plugins-3.3.14-1.3.noarch.rpm"
RPM_HASH = "fd9b140199b46ec9b72dbec74fb4d67940ed9c812bd87a042e3acaba2b7960bc21d49653c14d69e8177ac531db84b62bf3ab659badb22927609bae773eff1feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-plugins"

RDEPENDS:${PN} += "setroubleshoot-server"

inherit rpm
