SUMMARY = "Advanced Enumerations, NamedTuples, and NamedConstants"
DESCRIPTION = "Advanced Enumerations (compatible with Python's stdlib Enum), \
NamedTuples, and NamedConstants \
 \
AEnum includes a Python stdlib Enum-compatible data type, as well as \
a metaclass-based NamedTuple implementation and a NamedConstant \
class. \
 \
An Enum is a set of symbolic names (members) bound to unique, \
constant values. Within an enumeration, the members can be compared \
by identity, and the enumeration itself can be iterated over.  If \
using Python 3 there is built-in support for unique values, multiple \
values, auto-numbering, and suspension of aliasing (members with the \
same value are not identical), plus the ability to have values \
automatically bound to attributes. \
 \
A NamedTuple is a class-based, fixed-length tuple with a name for \
each possible position accessible using attribute-access notation as \
well as the standard index notation. \
 \
A NamedConstant is a class whose members cannot be rebound; it lacks \
all other Enum capabilities, however; consequently, it can have \
duplicate values."
LICENSE = "BSD-3-Clause"

PV = "3.1.12"

RPM_NAME = "python39-aenum-3.1.12-1.1.noarch.rpm"
RPM_HASH = "e150df1dd1670669e776b3a01ca8ee7b508cbbd56e9eb86968155c08abcbe88d9dbc1dab3f1966e129df24f4b8735ea5ee6015f315edbeb44cc040fd0c856460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aenum \
python39-aenum \
python3dist-aenum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
