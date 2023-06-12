SUMMARY = "Development files for httrack"
DESCRIPTION = "This package contains the header and library files for httrack."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "httrack-devel-3.49.2-2.8.aarch64.rpm"
RPM_HASH = "375e525f07eb8634fcc398390a04b78a70b1be5bacc047bb86cfa360474bbef9690a4e8224d55d9cab311d8b6dc4dba2094838a6f93b96bf991b660bf225164d"

RPROVIDES:${PN} += "httrack-devel \
httrack-devel(aarch-64)"
RDEPENDS:${PN} += "libhttrack2 \
libopenssl-devel"

inherit rpm
