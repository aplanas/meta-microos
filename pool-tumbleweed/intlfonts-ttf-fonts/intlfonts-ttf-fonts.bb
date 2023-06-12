SUMMARY = "TrueType Fonts from the GNU Intlfonts Package"
DESCRIPTION = "TrueType fonts from the GNU intlfonts package."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-ttf-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "c8b36409a24498839d96dd00f8abe9d56d5ef3ae57290b1e65322280d94e618631860a6730e2cfc5a94ebb9c961ac0f601a7e09aaf6be9b2a8f9c367625bcb5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(intlfonts-ttf-fonts) \
intlfonts-ttf \
intlfonts-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
