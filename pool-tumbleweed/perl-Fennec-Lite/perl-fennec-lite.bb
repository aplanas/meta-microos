SUMMARY = "Minimalist Fennec, the commonly used bits."
DESCRIPTION = "the Fennec manpage does a ton, but it may be hard to adopt it all at once. \
It also is a large project, and has not yet been fully split into component \
projects. Fennec::Lite takes a minimalist approach to do for Fennec what \
Mouse does for Moose. \
 \
Fennec::Lite is a single module file with no non-core dependencies. It can \
easily be used by any project, either directly, or by copying it into your \
project. The file itself is less than 300 lines of code at the time of this \
writing, that includes whitespace. \
 \
This module does not cover any of the more advanced features such as result \
capturing or SPEC workflows. This module only covers test grouping and \
group randomization. You can also use the FENNEC_ITEM variable with a group \
name or line number to run a specific test group only. Test::Builder is \
used under the hood for TAP output."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-Fennec-Lite-0.004-9.26.noarch.rpm"
RPM_HASH = "c844618fc2f79f528a70efc0c7657e7d31f0c3ad1d077bfa77edb0eeff36cf4cdc9a2a1af1f7dd82dae32c54a942bd2f8a7d7c85d6ef75dc597353f3a10893ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Fennec--Lite \
perl-Fennec-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
