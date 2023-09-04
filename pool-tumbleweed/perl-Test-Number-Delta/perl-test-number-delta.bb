SUMMARY = "Compare the difference between numbers against a given tolerance"
DESCRIPTION = "At some point or another, most programmers find they need to compare \
floating-point numbers for equality. The typical idiom is to test if the \
absolute value of the difference of the numbers is within a desired \
tolerance, usually called epsilon. This module provides such a function for \
use with the Test::More manpage. Usage is similar to other test functions \
described in the Test::More manpage. Semantically, the 'delta_within' \
function replaces this kind of construct: \
 \
 ok ( abs($p - $q) < $epsilon, '$p is equal to $q' ) or \
     diag '$p is not equal to $q to within $epsilon'; \
 \
While there's nothing wrong with that construct, it's painful to type it \
repeatedly in a test script. This module does the same thing with a single \
function call. The 'delta_ok' function is similar, but either uses a global \
default value for epsilon or else calculates a 'relative' epsilon on the \
fly so that epsilon is scaled automatically to the size of the arguments to \
'delta_ok'. Both functions are exported automatically. \
 \
Because checking floating-point equality is not always reliable, it is not \
possible to check the 'equal to' boundary of 'less than or equal to \
epsilon'. Therefore, Test::Number::Delta only compares if the absolute \
value of the difference is *less than* epsilon (for equality tests) or \
*greater than* epsilon (for inequality tests)."
LICENSE = "Apache-2.0"

PV = "1.060000"

RPM_NAME = "perl-Test-Number-Delta-1.060000-1.28.noarch.rpm"
RPM_HASH = "9698b0e2493666fdcf2aea0b829d3c20f1bbbaeadac5010e601a8a9559b22073379a05625723f6981534a7a59e5b7f66859f52c6eadcf6866c54a3f2343df8aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Number--Delta \
perl-Test-Number-Delta"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
