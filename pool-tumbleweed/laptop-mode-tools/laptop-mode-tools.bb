SUMMARY = "The Laptop Mode Tools"
DESCRIPTION = "Laptop Mode Tools is a laptop power saving package for Linux systems. \
It allows you to extend the battery life of your laptop, in several \
ways. It is the primary way to enable the Laptop Mode feature of the \
Linux kernel, which lets your hard drive spin down. In addition, it \
allows you to tweak a number of other power-related settings using a \
simple configuration file."
LICENSE = "GPL-2.0-or-later"

PV = "1.74"

RPM_NAME = "laptop-mode-tools-1.74-3.6.noarch.rpm"
RPM_HASH = "89bbc50cf0cb8332122ba2a88debb4f421e6ca41a87b8a7651007e74e157e52eba30d171fcaddaf169891ed77ffb59ac5ba37671d841109ea82aaa0d4eaa4820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-laptop-mode-tools \
laptop-mode-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
