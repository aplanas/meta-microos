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

RPM_NAME = "perl-Array-Unique-0.09-1.2.noarch.rpm"
RPM_HASH = "61252edebd11ec5220d9a8d0fea2136fe068bdfeaa0b1eea82b4a246a3466988df7f2a96d4543a82bdc98b6eb09091192b3fac2d8ec80b483ccf54d6c9aee506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Array--Unique \
perl-Array--Unique--Hash \
perl-Array--Unique--IxHash \
perl-Array--Unique--Quick \
perl-Array--Unique--Std \
perl-Array-Unique"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
