SUMMARY = "Common data files for use with elk"
DESCRIPTION = "This package provides common data files for use with any flavour of \
elk."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-data-8.7.2-1.3.noarch.rpm"
RPM_HASH = "84e57e5c919750cf577de251809afa2b644e5ed543cfc99bcecb656667f7747c5fd36519b4ee0a734c1dd40d2d89abab41a31d8408389ef52e20a3505fccb04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elk-data"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
