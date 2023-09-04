SUMMARY = "Acceptance tests for Future::IO implementations"
DESCRIPTION = "This module contains a collection of acceptance tests for implementations \
of Future::IO."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-Test-Future-IO-Impl-0.14-1.3.noarch.rpm"
RPM_HASH = "f0493ce3d0cb72b040129e9f7bf16147ba987bd3976e593899c95ab467330a4b673ddf1399fc9d5915c2f3ba1fa1ebf22732a7a7fa06852596bb03ead23fdb4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Future--IO--Impl \
perl-Test-Future-IO-Impl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test2--V0"

inherit rpm
