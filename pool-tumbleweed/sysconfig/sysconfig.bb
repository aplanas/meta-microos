SUMMARY = "The sysconfig scheme for traditional network scripts"
DESCRIPTION = "This package provides the SUSE system configuration scheme for the \
traditional 'ifup' alias 'netcontrol' network scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.90.0"

RPM_NAME = "sysconfig-0.90.0-3.2.aarch64.rpm"
RPM_HASH = "69a02a387033c1034cc37ded3fd9a273624bf5a36badeb3729a2b33074d8b7f364aea10a92a568996a7427449766a9f1a3abb6f38ada227e84d57fe867f74f3b"

RPROVIDES:${PN} += "config(sysconfig) \
sysconfig \
sysconfig(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
/usr/bin/chmod \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
