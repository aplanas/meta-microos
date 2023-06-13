SUMMARY = "Development files for Genius, a general purpose calculator"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax \
mimics how mathematics is usually written."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.27"

RPM_NAME = "genius-devel-1.0.27-1.9.aarch64.rpm"
RPM_HASH = "753264f2b49a9a656156dfef5f10dde178205c23e386b48b5ee5d5489e052fd113f4de92a2508cd3bb7384cfe4a4a06b7e303920607be27263e70f269b74b551"

RPROVIDES:${PN} += "genius-devel \
genius-devel(aarch-64)"

RDEPENDS:${PN} += "genius"

inherit rpm
