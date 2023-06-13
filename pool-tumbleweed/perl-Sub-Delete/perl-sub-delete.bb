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

RPM_NAME = "perl-Sub-Delete-1.00002-1.15.noarch.rpm"
RPM_HASH = "3176704350a190e09616190c01d679408b52e2883f56e0851e15ec499629f51d638d372621f3bb754643a9a31165156a2c5a443c5d436bd04b2ecef0ec514175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sub::Delete) \
perl-Sub-Delete"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
