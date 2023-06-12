SUMMARY = "Additional Package Documentation for ALSA"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-docs-1.2.9-1.1.noarch.rpm"
RPM_HASH = "462cb90637f3bc6405b80b18c51efe98dea608dc92b10917e962afe30021bd02b98d093445cf70295d98f5d33c49a4ea1346c84a09e3745b8f5a1da8300c6a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-docs"
RDEPENDS:${PN} += ""

inherit rpm
