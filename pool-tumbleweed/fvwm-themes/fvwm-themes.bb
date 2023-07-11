SUMMARY = "FVWM Configuration Framework"
DESCRIPTION = "FVWM Themes is a powerful configuration framework for FVWM, designed to \
be easily extendable and configurable.	It includes several prebuilt \
themes and a pack of images and sounds."
LICENSE = "GPL-2.0+"

PV = "0.7.0"

RPM_NAME = "fvwm-themes-0.7.0-41.12.noarch.rpm"
RPM_HASH = "1d04b24928ef6ece3a4c3b75a550033020e8516b8f9420f2f8bc914587e2f1f378d72bbad3f32829d44184f0060ea20c8eb27d39cb337a5b4daa943ec16675df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fvwm-themes"

RDEPENDS:${PN} += "/usr/bin/mkfifo \
/usr/bin/perl \
/usr/bin/sh \
fvwm2 \
perl"

inherit rpm
