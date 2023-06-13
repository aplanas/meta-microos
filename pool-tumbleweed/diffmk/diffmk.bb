SUMMARY = "Compute Differences between XML Documents"
DESCRIPTION = "Using DiffMk, you can build an automated comparison of two XML \
documents. The output format for viewing is HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "diffmk-1.0-161.26.noarch.rpm"
RPM_HASH = "2b6f961715327a1955a18d096c9202376270a0ea734bb23483eb9c3cfe01ded2e224b03a6fec465c3b56f3c9c19d04b4f4cbae119bff0189329132588dd512f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffmk \
perl-diffmk"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Algorithm-Diff \
perl-XML-DOM \
perl-XML-Parser"

inherit rpm
