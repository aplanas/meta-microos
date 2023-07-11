SUMMARY = "Nagios Remote Plug-In Executor documentation"
DESCRIPTION = "This package contains the README files, OpenOffice and PDF \
documentation for the remote plugin executor (NRPE) for Nagios."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.3"

RPM_NAME = "nrpe-doc-4.0.3-5.5.noarch.rpm"
RPM_HASH = "9c1073947cc0d1dff439a02776eb0fb13eb5826e15e77b17aa2be39ff9f0a3e3bc8de4967182572fa4b704f88535f3f86f184c3c5b9c233fbc77b75e4401f194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-nrpe-doc \
nrpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
