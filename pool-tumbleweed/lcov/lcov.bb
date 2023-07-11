SUMMARY = "A Graphical GCOV Front-end"
DESCRIPTION = "LCOV is a graphical front-end for GCC's coverage testing tool gcov. It collects \
gcov data for multiple source files and creates HTML pages containing the \
source code annotated with coverage information. It also adds overview pages \
for easy navigation within the file structure."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "lcov-2.0-1.5.noarch.rpm"
RPM_HASH = "f0290b30a7fb5c6126f199187f70ae9998064f3b2ce7dc3d71236020f31d09ad96632552df99caa5833643ab56fc74cf878b3b89b05815068989e651c98d30a9"
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
