SUMMARY = "Development files for alembic"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for alembic. If you would like to develop programs using alembic, \
you will need to install alembic-devel."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "alembic-devel-1.8.4-1.3.aarch64.rpm"
RPM_HASH = "ceda33d31a517e0a18fa4eda3733eaf9724ff24d255e403d74af1f406f7c3226e6ca3e9287d3c09afcd5beaadeafb35623f749296d9d9677c1cf48c081a5c987"

RPROVIDES:${PN} += "alembic-devel \
alembic-devel(aarch-64)"

RDEPENDS:${PN} += "libAlembic1_8"

inherit rpm
