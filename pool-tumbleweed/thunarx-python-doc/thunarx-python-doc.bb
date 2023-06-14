SUMMARY = "Documentation for thunarx-python"
DESCRIPTION = "This package provides the documentation files for python thunarx."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "thunarx-python-doc-0.5.2-1.12.aarch64.rpm"
RPM_HASH = "c26974cde41401dca482217fc68e6944af3edd17d30518cfb80971a59397506cb523094ef9d47d6c188a8eff5c818a75717580678de0b087d3068691dd3fa81f"

RPROVIDES:${PN} += "thunarx-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
