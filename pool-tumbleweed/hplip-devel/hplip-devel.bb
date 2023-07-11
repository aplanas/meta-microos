SUMMARY = "Development files for hplip"
DESCRIPTION = "This sub-package is only required by developers."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-devel-3.22.10-2.3.aarch64.rpm"
RPM_HASH = "6ea856c4590c6b0e0a438758cd2c40553a0d782490c938fc63bd1944f43634349dbf8969813ba0404fb9738519835e252282d25a4e4ec46e8a7c4f99b3a45bba"

RPROVIDES:${PN} += "hplip-devel"

RDEPENDS:${PN} += "cups-devel \
dbus-1-devel \
hplip-hpijs \
hplip-sane \
libopenssl-devel \
libusb-1-0-devel \
net-snmp-devel"

inherit rpm
