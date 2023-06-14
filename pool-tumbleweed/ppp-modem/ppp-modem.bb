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

RPM_NAME = "ppp-modem-2.4.9-3.3.noarch.rpm"
RPM_HASH = "cd2839623498f1bb669c4e2e03d3bf09f2408e88fa1bec9bb575e4e69af5850ebf2255bfddf5aa04f93c0f3e69168d1f4a9b13d6c4f8f7fa8009afe08558daf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ppp-modem \
ppp-modem"

RDEPENDS:${PN} += "group-dialout \
ppp \
udev"

inherit rpm
