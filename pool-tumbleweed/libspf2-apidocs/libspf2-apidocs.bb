SUMMARY = "API documentation for the libspf2 library"
DESCRIPTION = "The libspf2-apidocs package contains the API documentation for creating \
applications that use the libspf2 (Sender Policy Framework) library."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-apidocs-1.2.11-6.13.noarch.rpm"
RPM_HASH = "056fecc8de450d10b51a8e1becbab1b421b7a5470c87e87e81cb2f731c3e3b5b41d6e3daafadac42a4fa7c60c7ee6875fbda3b6da5199a4b60f045be37fc7ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libspf2-apidocs"

RDEPENDS:${PN} += ""

inherit rpm
