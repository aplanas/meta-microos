SUMMARY = "Update dynamic DNS records hosted by dns24.ch"
DESCRIPTION = "DNS24 (dns24.ch) is a DNS hosting service offering support for dynamic DNS. \
With this utility you can easily configure regular updates of your dynamic DNS \
records hosted by DNS24."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "dns24-update-1.1-1.9.noarch.rpm"
RPM_HASH = "c61283f1172779a5387bfc5d12f75867f960a520f0fea492ff987764de8dcaec2c33e79590f3ef05be005c930573ab66ecb3e29f923f38d8845d9d14a5646af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dns24-update) \
dns24-update"

RDEPENDS:${PN} += "/bin/sh \
curl"

inherit rpm
