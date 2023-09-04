SUMMARY = "Configure-time utilities for using C headers,"
DESCRIPTION = "Often Perl modules are written to wrap functionality found in existing C \
headers, libraries, or to use OS-specific features. It is useful in the \
_Build.PL_ or _Makefile.PL_ file to check for the existance of these \
requirements before attempting to actually build the module. \
 \
Objects in this class provide an extension around ExtUtils::CBuilder to \
simplify the creation of a _.c_ file, compiling, linking and running it, to \
test if a certain feature is present. \
 \
It may also be necessary to search for the correct library to link against, \
or for the right include directories to find header files in. This class \
also provides assistance here."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-ExtUtils-CChecker-0.11-1.11.noarch.rpm"
RPM_HASH = "73e13c42a3255ec850b8fb4b3d497b1831c63166b407f1fe8ddbdf4ef36ef93b886f439c2639bcf53d1ff34bf7c3645bf13490e799b8837339123d2f7605d38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--CChecker \
perl-ExtUtils-CChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--CBuilder"

inherit rpm
