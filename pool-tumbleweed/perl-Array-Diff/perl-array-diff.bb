SUMMARY = "Find the differences between two arrays"
DESCRIPTION = "This module compares two *pre-sorted* arrays and returns the added or \
deleted elements in two separate arrays. It's a simple wrapper around \
Algorithm::Diff. \
 \
*Note*: the arrays must be sorted before you call 'diff'. \
 \
And if you need more complex array tools, check Array::Compare."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Array-Diff-0.09-1.11.noarch.rpm"
RPM_HASH = "f068d8b524a7ff73522392497e7917c49c7de84457c3790e8c885bc80070facf6186fe9e96e5247143d24cbd22ed03a53acdb156cc62becc3ebe128484d26417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Array--Diff \
perl-Array-Diff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Algorithm--Diff \
perl-Class--Accessor--Fast"

inherit rpm
