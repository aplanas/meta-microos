SUMMARY = "Automatic redial for any USB modem supported by the kernel"
DESCRIPTION = "This package contains peer, chat script, systemd unit and udev rule for \
automatic redial when connecting any USB modem supported by the kernel. \
For disable automatic redial (by default enabled for all), run \
sudo systemctl mask modem@0.service \
For enable again automatic redial, run \
sudo systemctl unmask modem@0.service \
'0' after '@' is the serial number of the modem, if you have more than one, \
you can disable unnecessary or disable everything."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ppp-modem-2.4.9-3.4.noarch.rpm"
RPM_HASH = "8240bed7239b1ddd719763e302be86725cef673f3e0711352d3c41f3d9680ffaae8b8d581a6bc8b3a17fe5dcba2fad8aee689be43df39756e02da945794df770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ppp-modem \
ppp-modem"

RDEPENDS:${PN} += "group-dialout \
ppp \
udev"

inherit rpm
