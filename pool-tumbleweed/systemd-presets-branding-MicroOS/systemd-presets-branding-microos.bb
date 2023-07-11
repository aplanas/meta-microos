SUMMARY = "Systemd default presets for openSUSE MicroOS"
DESCRIPTION = "Default presets for systemd on openSUSE MicroOS"
LICENSE = "MIT"

PV = "20230214"

RPM_NAME = "systemd-presets-branding-MicroOS-20230214-2.2.noarch.rpm"
RPM_HASH = "567aa1beda101e185c3d673d99adec4b27324b7f57f8c8651c66cba5177f495453139ca0766559b1a3cfa4c0a0db3655c2883e735d236c4182a6e0acac2fc9b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
