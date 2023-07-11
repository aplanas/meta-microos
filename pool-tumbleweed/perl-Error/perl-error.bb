SUMMARY = "Error/exception handling in an OO-ish way"
DESCRIPTION = "The 'Error' package provides two interfaces. Firstly 'Error' provides a \
procedural interface to exception handling. Secondly 'Error' is a base \
class for errors/exceptions that can either be thrown, for subsequent \
catch, or can simply be recorded. \
 \
Errors in the class 'Error' should not be thrown directly, but the user \
should throw errors from a sub-class of 'Error'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17029"

RPM_NAME = "perl-Error-0.17029-1.14.noarch.rpm"
RPM_HASH = "4100fd91139914a0732382ae9d28ccc7738e584aa23dbecd006f8f2b0e48db8a32fae17e50ac25cfec50b8086cbb6c1f67e60591dd48d772d12fb02cc43611fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Error \
perl-Error--Simple \
perl-Error--WarnDie \
perl-Error--subs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
