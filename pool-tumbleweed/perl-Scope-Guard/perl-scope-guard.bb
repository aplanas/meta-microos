SUMMARY = "Lexically-Scoped Resource Management"
DESCRIPTION = "This module provides a convenient way to perform cleanup or other forms of \
resource management at the end of a scope. It is particularly useful when \
dealing with exceptions: the 'Scope::Guard' constructor takes a reference \
to a subroutine that is guaranteed to be called even if the thread of \
execution is aborted prematurely. This effectively allows lexically-scoped \
'promises' to be made that are automatically honoured by perl's garbage \
collector. \
 \
For more information, see: the http://www.drdobbs.com/cpp/184403758 manpage"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Scope-Guard-0.21-1.27.noarch.rpm"
RPM_HASH = "4c9bb341f1dfc7a56fcf8a8a55e05cf1c7c3f667964f2043d2952f414a19504945de6974cb8d87791d06bfe6abbb2bbcc6ae82d37d06c6937ab3501bc035f8f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Scope--Guard \
perl-Scope-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
