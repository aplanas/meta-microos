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

RPM_NAME = "perl-Array-Diff-0.09-1.10.noarch.rpm"
RPM_HASH = "9edf486ed1ffc02d5261b9efe4ec8a900a77ed6c319809e6b95017e4b7804bf6f122bdb08fdf84d2dfe0891a249a46db90decb825e21e1edfa8ad856110ec6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Array--Diff \
perl-Array-Diff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Algorithm--Diff \
perl-Class--Accessor--Fast"

inherit rpm
