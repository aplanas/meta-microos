SUMMARY = "The Laptop Mode Tools"
DESCRIPTION = "Laptop Mode Tools is a laptop power saving package for Linux systems. \
It allows you to extend the battery life of your laptop, in several \
ways. It is the primary way to enable the Laptop Mode feature of the \
Linux kernel, which lets your hard drive spin down. In addition, it \
allows you to tweak a number of other power-related settings using a \
simple configuration file."
LICENSE = "GPL-2.0-or-later"

PV = "1.74"

RPM_NAME = "laptop-mode-tools-1.74-3.7.noarch.rpm"
RPM_HASH = "3c716d5312c236b0ba8e265429e64e605be15de65d7e03de15a8303625d1da1261f46ec1808968acc86ecc0f74c22386b6bdf8cb5c1e198de9c9d9232dfac22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-laptop-mode-tools \
laptop-mode-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
