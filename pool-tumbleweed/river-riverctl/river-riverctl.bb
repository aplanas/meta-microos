SUMMARY = "Command-line interface for controlling river"
DESCRIPTION = "A command-line utility used to control and configure river over the Wayland protocol."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-riverctl-0.2.4+g953-2.1.aarch64.rpm"
RPM_HASH = "4abd1799c423244650468fac5b21431dcdede4d06754a95dbe1659b795d62426fa09feab2581eb0c935267ec41859c174e91907742323957b6ce9537eb1a7c90"

RPROVIDES:${PN} += "river-riverctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
