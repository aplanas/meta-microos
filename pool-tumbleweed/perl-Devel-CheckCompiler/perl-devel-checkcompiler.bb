SUMMARY = "Check the compiler's availability"
DESCRIPTION = "Devel::CheckCompiler is checker for compiler's availability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Devel-CheckCompiler-0.07-1.23.noarch.rpm"
RPM_HASH = "1aa443472e0976c139db965e492ecb94fb33056558157948cb87eee133ce2abc7ca17d9f94d93dd5868f733f637ff2a56fc9149c90d0bd7d74fef9a74f2629ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--AssertC99 \
perl-Devel--CheckCompiler \
perl-Devel-CheckCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
