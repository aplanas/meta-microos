SUMMARY = "Data files for extreme-tuxracer"
DESCRIPTION = "This package contains the data files for extreme-tuxracer."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "extreme-tuxracer-data-0.8.2-1.4.noarch.rpm"
RPM_HASH = "6e2d46e6e3e48a04d2d8f45ec79960c82142a83b525a888118df873b2867f6ca6d73f73da6afa56d2911bdfb05d16e2cf08d3a559ec7ce31cb958a2e8605fbb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extreme-tuxracer-data"
RDEPENDS:${PN} += ""

inherit rpm
