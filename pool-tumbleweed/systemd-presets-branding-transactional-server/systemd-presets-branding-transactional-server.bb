SUMMARY = "Systemd presets for Transactional Server System Role"
DESCRIPTION = "Service presets for systemd for Transactional Server System Role."
LICENSE = "MIT"

PV = "15.0"

RPM_NAME = "systemd-presets-branding-transactional-server-15.0-4.11.noarch.rpm"
RPM_HASH = "41f8bc06d0928305cf6c61d77fe1574f8c668773ef0e269d1d3512589d034c838d13f169eb52cd6bc79c0ad7c2483f2075fa10f112b1bb4249edfe2668eb4e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding-transactional-server"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
