SUMMARY = "Acceptance tests for Future::IO implementations"
DESCRIPTION = "This module contains a collection of acceptance tests for implementations \
of Future::IO."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-Test-Future-IO-Impl-0.14-1.2.noarch.rpm"
RPM_HASH = "bbd42c61bf55550eb2180c1007f321b1a7d89f99df2d6722b4a511816d6c85b8f89fb5247a1ede156690f57d34db0594b33478a4db0371cb90a87edf888a82d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Future--IO--Impl \
perl-Test-Future-IO-Impl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test2--V0"

inherit rpm
