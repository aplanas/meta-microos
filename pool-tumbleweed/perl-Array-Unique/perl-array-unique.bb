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

RPM_NAME = "perl-Array-Unique-0.09-1.1.noarch.rpm"
RPM_HASH = "77ea4c02791eb90a0899e9bd2d27ff2f6cabaa3b0e3f77bf0d8eee7d1edc3c5c860c1c586652a90823893f57b8c81c48e5c9d31107989a8bc16840c51fcf24cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Array::Unique) \
perl(Array::Unique::Hash) \
perl(Array::Unique::IxHash) \
perl(Array::Unique::Quick) \
perl(Array::Unique::Std) \
perl-Array-Unique"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
