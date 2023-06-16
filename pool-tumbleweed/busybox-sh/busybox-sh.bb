SUMMARY = "Busybox sh, ash and hush"
DESCRIPTION = "This package contains the busybox sh, ash and hush."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-sh-1.36.0-26.3.noarch.rpm"
RPM_HASH = "b5266322fbfac29e8c37ab6972a4808cae29542d858988f882511bbcaf4c2e60170e67fdc7c44181a1ceabaff870586c915d09312b96db493a15ce745f2f7f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
busybox-sh"

RDEPENDS:${PN} += "busybox"

inherit rpm
