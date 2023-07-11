SUMMARY = "Rule files for Xindy"
DESCRIPTION = "xindy is an index processor that can be used to generate book-like \
indexes for arbitrary document-preparation systems. \
 \
This package contains the rule files (the knowledge base) of xindy."
LICENSE = "GPL-2.0+"

PV = "2.5.1"

RPM_NAME = "xindy-rules-2.5.1-2.27.noarch.rpm"
RPM_HASH = "3709e25b31c019fd7f2c9a634472e43b9a10572d2205290ae80b14ddc88168cf6e4aab6b95ededf415a952f1078c30510296779a0fe1f1e2cd5da6cba7097813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xindy-rules"

RDEPENDS:${PN} += ""

inherit rpm
