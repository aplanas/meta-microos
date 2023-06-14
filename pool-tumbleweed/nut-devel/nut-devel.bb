SUMMARY = "Network UPS Tools (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-devel-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "8ac8f281425c7038c835a842052047db5ba8c28d8fe31153f85a3f6f722ee6f45b5473f7a5bcad0b82e182998bb084ce864ee2f177ec7d5f11a6156ac16e17a9"

RPROVIDES:${PN} += "nut-devel \
pkgconfig-libnutclient \
pkgconfig-libnutclientstub \
pkgconfig-libnutscan \
pkgconfig-libupsclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnutclient2 \
libnutclientstub1 \
libnutscan2 \
libupsclient6 \
pkgconfig-openssl"

inherit rpm
