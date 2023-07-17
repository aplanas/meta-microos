SUMMARY = "Network UPS Tools (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-devel-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "3bcf01e9845cbb0daed74712f8db8176eef0673ee87eff47ec2e8a2129b90a038058e20bb9056b2a16c3625c06ce343f5882515719d6c578593eb640e37bcf7f"

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
