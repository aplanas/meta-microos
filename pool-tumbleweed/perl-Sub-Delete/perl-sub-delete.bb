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

RPM_NAME = "perl-Sub-Delete-1.00002-1.16.noarch.rpm"
RPM_HASH = "4e198bbef12bbc656ae4eb4314b31b139b3208c9fda362615856d54f61a5f7af81f7629e45de2610a68a8579bdbee2cc32bc60fc6c48c6e939b50035a23026d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Delete \
perl-Sub-Delete"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
