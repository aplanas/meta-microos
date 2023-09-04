SUMMARY = "Compute Differences between XML Documents"
DESCRIPTION = "Using DiffMk, you can build an automated comparison of two XML \
documents. The output format for viewing is HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "diffmk-1.0-161.28.noarch.rpm"
RPM_HASH = "bfd798d95b810865be8bd6db5f9b714b11d9ebb168a31630fafcaab6f4118f44b46108f0c4a159406d25f85e2a6a46eaa7cf4df7de5ad6a13a6fff5763a0b40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffmk \
perl-diffmk"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Algorithm-Diff \
perl-XML-DOM \
perl-XML-Parser"

inherit rpm
