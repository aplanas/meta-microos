SUMMARY = "HTML documentation of molequeue"
DESCRIPTION = "HTML documentation of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-doc-0.9.0-3.10.noarch.rpm"
RPM_HASH = "6797d008c5f01dbc77725fe3ae964eda4c7995b8297c6dc7bd8ab727beeeb88d62999387031299e050592fa65bdce389765710e73494e16e8b4cd7253d98cc0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molequeue-doc"

RDEPENDS:${PN} += ""

inherit rpm
