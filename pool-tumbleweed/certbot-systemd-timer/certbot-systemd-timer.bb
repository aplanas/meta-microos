SUMMARY = "systemd timer unit to renew certbot certificates"
DESCRIPTION = "Optional systemd timer, which takes care of certbot certificate renewals."
LICENSE = "Apache-2.0"

PV = "0.0"

RPM_NAME = "certbot-systemd-timer-0.0-3.11.noarch.rpm"
RPM_HASH = "230a5d3e7939e1231d5c31f1641b91bb539b0cd81cf71810a1ff824fea45704d8c4334342e66ecd0e40845cb1d35e1c8f58e413f11a1ead2cc7faa817e7c4148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot-systemd-timer"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
python3-certbot \
systemd"

inherit rpm
