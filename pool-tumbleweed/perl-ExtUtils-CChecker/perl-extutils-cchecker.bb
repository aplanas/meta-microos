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

RPM_NAME = "perl-ExtUtils-CChecker-0.11-1.10.noarch.rpm"
RPM_HASH = "987fb7b9fba735c5b5a19529ef6bae049cad8aca949bde384bc884d5f374dc604b9e7ba3ebe05c30057e1a81c11883a39f58005e6c0212ff421a0278cbaf64fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--CChecker \
perl-ExtUtils-CChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--CBuilder"

inherit rpm
