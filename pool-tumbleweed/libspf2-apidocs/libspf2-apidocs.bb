SUMMARY = "API documentation for the libspf2 library"
DESCRIPTION = "The libspf2-apidocs package contains the API documentation for creating \
applications that use the libspf2 (Sender Policy Framework) library."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-apidocs-1.2.11-6.12.noarch.rpm"
RPM_HASH = "4051d05b6141b5cae0caf70f4b42c1c2c8f9479bcb2874c02f7329bb0ce40877194e8fcea6523b23fd35c4bef783d93e1bd7f3b5fa2175033375b733d8d70d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libspf2-apidocs"

RDEPENDS:${PN} += ""

inherit rpm
