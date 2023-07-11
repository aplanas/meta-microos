SUMMARY = "Development package for deepin-polkit-agent"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-devel-5.5.21-1.3.aarch64.rpm"
RPM_HASH = "4b8c0546caec196514793497238ff361cf3362c29533795a2dfa33578c54c9a8ea07c653b0241ad216ec3e2ca1c6c753bfef9976db0e6d5e6684aed8a9d7b137"

RPROVIDES:${PN} += "deepin-polkit-agent-devel"

RDEPENDS:${PN} += "deepin-polkit-agent"

inherit rpm
