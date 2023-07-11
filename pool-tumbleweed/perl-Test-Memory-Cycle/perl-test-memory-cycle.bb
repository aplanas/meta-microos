SUMMARY = "Check for memory leaks and circular memory references"
DESCRIPTION = "Check for memory leaks and circular memory references"
LICENSE = "Artistic-2.0"

PV = "1.06"

RPM_NAME = "perl-Test-Memory-Cycle-1.06-2.26.noarch.rpm"
RPM_HASH = "d263be83400b8f7c01d130cc19c52027a4748efb58ad4b9ab1c1286c0a3870002b72bf559b38c5b28185c34748c2271f27978376117d91b8cd2cd21f5dc34296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Memory--Cycle \
perl-Test-Memory-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Cycle \
perl-PadWalker"

inherit rpm
