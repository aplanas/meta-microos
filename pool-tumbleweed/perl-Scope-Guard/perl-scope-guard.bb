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

RPM_NAME = "perl-Scope-Guard-0.21-1.28.noarch.rpm"
RPM_HASH = "0a5e37fb3f2bb9e1e0284593ba5e3366ee667cc9b68a72255f32bc8d72c55e8d276bc42a22e7e58ec15df03fc2624aacd50376fdbd24d3d624e387126e93366e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Scope--Guard \
perl-Scope-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
