SUMMARY = "Plymouth 'Fade-In' theme"
DESCRIPTION = "This package contains the 'Fade-In' boot splash theme for \
Plymouth. It features a centered logo that fades in and out \
while stars twinkle around the logo during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-fade-in-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "e2b4816b43821b0e0f334d16509f362a06f27d206f8c2145c526c41a36690dde6fc9e544ffd112bf9b664a07c55ec4ff93f9ab63164edc2e8ada47d240617af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-fade-in"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-fade-throbber \
plymouth-plugin-label \
plymouth-scripts"

inherit rpm
