SUMMARY = "A Graphical GCOV Front-end"
DESCRIPTION = "LCOV is a graphical front-end for GCC's coverage testing tool gcov. It collects \
gcov data for multiple source files and creates HTML pages containing the \
source code annotated with coverage information. It also adds overview pages \
for easy navigation within the file structure."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "lcov-2.0-1.1.noarch.rpm"
RPM_HASH = "1664b679a78c60878f8e7489ebd4c0139b2e72e10a043ae2d683ef15dcf98e283a378084c94d0512004a52bb4b508d702b71f69601addd50cb0250f601cb9f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lcov \
lcov \
perl-BranchBlock \
perl-BranchData \
perl-BranchEntry \
perl-CountData \
perl-FunctionEntry \
perl-FunctionMap \
perl-InOutFile \
perl-JsonSupport \
perl-MapData \
perl-ReadCurrentSource \
perl-TraceFile \
perl-TraceInfo \
perl-lcovutil"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
findutils \
gcc \
perl-Capture-Tiny \
perl-DateTime \
perl-GD \
perl-PerlIO-gzip"

inherit rpm
