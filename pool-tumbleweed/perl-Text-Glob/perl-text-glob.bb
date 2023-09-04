SUMMARY = "Match Globbing Patterns Against Text"
DESCRIPTION = "Text::Glob implements glob(3) style matching that can be used to match \
against text, rather than fetching names from a filesystem. If you want to \
do full file globbing use the File::Glob module instead."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Text-Glob-0.11-1.25.noarch.rpm"
RPM_HASH = "1de3f1a820c36d3a90a9287db8900923e06e6932c43ca9e876efdaa8d0fc075eaf30af34628d7df42bba4f5943d9ab70fd15e6597eefca8657a4a8f62af75a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Glob \
perl-Text-Glob"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
