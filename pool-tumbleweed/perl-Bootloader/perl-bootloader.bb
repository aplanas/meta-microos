SUMMARY = "Tool for boot loader configuration"
DESCRIPTION = "Shell script wrapper for configuring various boot loaders."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "perl-Bootloader-1.6-1.1.aarch64.rpm"
RPM_HASH = "db4d9ab770256eb97cf292a4f7edb8e086274e1ffe6c4abc5ea25207e5f4a08727c725979783eb8f17fd62905127a7d259ca06535dcd51fa43e32b9ab00aa3af"

RPROVIDES:${PN} += "/sbin/update-bootloader \
perl-Bootloader"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
coreutils \
perl-base"

inherit rpm
