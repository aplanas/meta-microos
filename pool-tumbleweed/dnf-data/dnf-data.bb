SUMMARY = "Common data and configuration files for DNF"
DESCRIPTION = "This package provides the common data and configuration files for DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-data-4.14.0-3.2.noarch.rpm"
RPM_HASH = "88562f22cf302676345fbfc060631f5ea1a6b3171b870b6b4c0804199798535051ac5f37234f90382edd540636abf5f321d58b37caa510970e0cc9f3e37dcfee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dnf-data \
dnf-conf \
dnf-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
