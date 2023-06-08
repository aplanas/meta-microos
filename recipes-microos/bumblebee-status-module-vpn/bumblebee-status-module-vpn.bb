SUMMARY = "Displays the VPN profile"
DESCRIPTION = "Displays the VPN profile that is currently in use."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-vpn-2.1.5-3.3.noarch.rpm"
RPM_HASH = "1a99589a0feef807ab89f822fdba9364bd12cecf563eb9ed685ec012d2e842e8bd43528038bed6f90da0e000e39b449f63ee3bc590b495c5485d16491523729f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-vpn"
RDEPENDS:${PN} += "bumblebee-status python3-tk"

inherit rpm
