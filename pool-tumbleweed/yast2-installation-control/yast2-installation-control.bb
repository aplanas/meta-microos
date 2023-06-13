SUMMARY = "YaST2 - RNG schema for installation control files"
DESCRIPTION = "This package contains RNG schema for validating the installation control files."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-installation-control-4.6.0-1.1.noarch.rpm"
RPM_HASH = "1bf5546bd078a2d620d737e49d2530734f03192cf4d53a456b22126310f4fd642252d47aae99b0f5432b81fdd2892fe42bcb5010dd98f1713f60e7be4f6187bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(skelcd_control_datadir) \
yast2-installation-control"

RDEPENDS:${PN} += ""

inherit rpm
