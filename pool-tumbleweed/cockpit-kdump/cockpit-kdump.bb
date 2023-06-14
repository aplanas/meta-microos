SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-kdump-276.1-4.4.noarch.rpm"
RPM_HASH = "17155dde135fdf35e7baabfc5a4ed179248641ff6bd988d1bca4200039244f4346e923a0104f1efcd8af19fdcfc1d80f3de8ea378bdf6e78c8047b41e81fd5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
kexec-tools"

inherit rpm
