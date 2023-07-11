SUMMARY = "Network UPS Tools (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-devel-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "42dcdde4b892ccc9f46fa663bc57cb45a4f370766dd0e2a2695efd7ea44bf9f45785eabcf73b55b7b280b5f937ee6694eb8b2bba4572af186078e465a652e8b6"

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
