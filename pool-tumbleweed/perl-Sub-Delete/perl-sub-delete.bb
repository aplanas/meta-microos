SUMMARY = "Perl module enabling one to delete subroutines"
DESCRIPTION = "This module provides one function, 'delete_sub', that deletes the \
subroutine whose name is passed to it. (To load the module without \
importing the function, write 'use Sub::Delete();'.) \
 \
This does more than simply undefine the subroutine in the manner of 'undef \
&foo', which leaves a stub that can trigger AUTOLOAD (and, consequently, \
won't work for deleting methods). The subroutine is completely obliterated \
from the symbol table (though there may be references to it elsewhere, \
including in compiled code)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.00002"

RPM_NAME = "perl-Sub-Delete-1.00002-1.17.noarch.rpm"
RPM_HASH = "30191ca60245a3ac4ec1ff4c9b980365780cf5081892cc0eb8b4d5ed8d6b2340b1ed3ca68202b99c5c8753f26b7a819736393b8b9f1d44eddfa3f523bd95a323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Delete \
perl-Sub-Delete"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
