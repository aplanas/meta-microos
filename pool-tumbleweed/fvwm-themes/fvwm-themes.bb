SUMMARY = "FVWM Configuration Framework"
DESCRIPTION = "FVWM Themes is a powerful configuration framework for FVWM, designed to \
be easily extendable and configurable.	It includes several prebuilt \
themes and a pack of images and sounds."
LICENSE = "GPL-2.0+"

PV = "0.7.0"

RPM_NAME = "fvwm-themes-0.7.0-41.11.noarch.rpm"
RPM_HASH = "d37f9a6989836cf4c8ebfbd2f836fe9d60094571e06160e8d22ae0c2c693b915128f056ef7c4672f842c3ce4190658d5871631d19bea74bd0b4bf71a44655b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fvwm-themes"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkfifo \
/usr/bin/perl \
fvwm2 \
perl"

inherit rpm
