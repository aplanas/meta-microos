SUMMARY = "Compute Differences between XML Documents"
DESCRIPTION = "Using DiffMk, you can build an automated comparison of two XML \
documents. The output format for viewing is HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "diffmk-1.0-161.27.noarch.rpm"
RPM_HASH = "c3088d8fb32753ebb59d3b6d29e2ceb362882113d1be6b08120486544f1f5da7a64d48b411402d5edb3d36a1414a5ab0a009fc7ac486984cc560d417830eb360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffmk \
perl-diffmk"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Algorithm-Diff \
perl-XML-DOM \
perl-XML-Parser"

inherit rpm
