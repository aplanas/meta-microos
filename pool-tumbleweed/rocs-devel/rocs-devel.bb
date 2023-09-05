SUMMARY = "Development files for Rocs"
DESCRIPTION = "This package provides development files and headers needed \
to build software using Rocs."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "rocs-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "956ac2fc5c4a02898e65852eb15ca79d69327e6ec6d2189efd6bb983886365637f61073264f8f2243947e39405fa3e9fb77c2a8b03faec7b227f18ee8a83f67f"

RPROVIDES:${PN} += "rocs-devel"

RDEPENDS:${PN} += "librocsgraphtheory0"

inherit rpm
