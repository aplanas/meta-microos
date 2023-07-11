SUMMARY = "Update dynamic DNS records hosted by dns24.ch"
DESCRIPTION = "DNS24 (dns24.ch) is a DNS hosting service offering support for dynamic DNS. \
With this utility you can easily configure regular updates of your dynamic DNS \
records hosted by DNS24."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "dns24-update-1.1-1.10.noarch.rpm"
RPM_HASH = "d4bae4616857aee72d9464d775f60b5bb52994d1a7f0a7333c3b10fc37fc9757716db6481ca584702276697a89c63e6071065e6816a8924ae194721378051b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dns24-update \
dns24-update"

RDEPENDS:${PN} += "/usr/bin/sh \
curl"

inherit rpm
