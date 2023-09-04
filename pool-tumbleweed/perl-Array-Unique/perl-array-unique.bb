SUMMARY = "Tie-able array that allows only unique values"
DESCRIPTION = "This package lets you create an array which will allow only one occurrence \
of any value. \
 \
In other words no matter how many times you put in 42 it will keep only the \
first occurrence and the rest will be dropped. \
 \
You use the module via tie and once you tied your array to this module it \
will behave correctly. \
 \
Uniqueness is checked with the 'eq' operator so among other things it is \
case sensitive. \
 \
As a side effect the module does not allow undef as a value in the array."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Array-Unique-0.09-1.3.noarch.rpm"
RPM_HASH = "bea5ef7cc1078fa635be620b9567c82bf0fc8d91cb069d44f691435abaab1ab54dbb291f2154dc3053306b2aca87fa380b3305f9a5841bd75dd6b737b1dcde2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Array--Unique \
perl-Array--Unique--Hash \
perl-Array--Unique--IxHash \
perl-Array--Unique--Quick \
perl-Array--Unique--Std \
perl-Array-Unique"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
