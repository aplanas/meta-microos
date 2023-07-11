SUMMARY = "NetworkManager compatibility for connman"
DESCRIPTION = "Provides NetworkManager compatibility for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-nmcompat-1.41-4.8.aarch64.rpm"
RPM_HASH = "7a8708996393b6523c34c5c6e15b84baf0ce8fffb2082281180902faa1c32b0753944097943a09312eb405b4f05ed30ab777852009c59e393878e10fd7dab931"

RPROVIDES:${PN} += "connman-nmcompat"

RDEPENDS:${PN} += "connman"

inherit rpm
