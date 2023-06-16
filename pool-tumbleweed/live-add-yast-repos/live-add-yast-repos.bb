SUMMARY = "A script to add the repos from control.xml to the system"
DESCRIPTION = "This package contains a script which adds all defined repositories from \
control.xml (using extra_url) to the system."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "live-add-yast-repos-1.0-6.6.aarch64.rpm"
RPM_HASH = "ced8749edcd061272a4a4dd6744be2a46c5cf58e2d27f496e9697ab9bc59ae4d2c4b51afaa1fcecc07868731b34299bf4ef4e1a3246a79e6e9f8c5ca47a30929"

RPROVIDES:${PN} += "live-add-yast-repos"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
