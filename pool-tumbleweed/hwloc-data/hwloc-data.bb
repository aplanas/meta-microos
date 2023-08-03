SUMMARY = "Run time data for hwloc"
DESCRIPTION = "This package contains the run time data for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.2"

RPM_NAME = "hwloc-data-2.9.2-1.1.noarch.rpm"
RPM_HASH = "afa9a7cbf8796e313d8316bcdf7fe5d6db6cb2177fbfc060f0ae4abee469ac3fdf2a4482315a6fccdaba72329d7585bb7257bb4378305d1e8f91db3b64255537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-data"

RDEPENDS:${PN} += ""

inherit rpm
