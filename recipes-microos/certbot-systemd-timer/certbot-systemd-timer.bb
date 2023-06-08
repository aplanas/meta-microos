SUMMARY = "systemd timer unit to renew certbot certificates"
DESCRIPTION = "Optional systemd timer, which takes care of certbot certificate renewals."
LICENSE = "Apache-2.0"

PV = "0.0"

RPM_NAME = "certbot-systemd-timer-0.0-3.10.noarch.rpm"
RPM_HASH = "87646253101507b665d94ed570de51160030feb74d332157ba63499ad90ae0a45ad086fcfbc95aed480516274112add51e84e25278f2ea5dd66aae1476169dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot-systemd-timer"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup python3-certbot systemd"

inherit rpm
