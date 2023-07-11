SUMMARY = "Attributes without boilerplate"
DESCRIPTION = "attrs is an MIT-licensed Python package with class decorators that ease the \
chores of implementing the most common attribute-related object protocols. \
 \
You just specify the attributes to work with and attrs gives you: \
  - a nice human-readable __repr__, \
  - a complete set of comparison methods, \
  - an initializer, \
  - and much more \
 \
without writing dull boilerplate code again and again. \
 \
This gives you the power to use actual classes with actual types in your code \
instead of confusing tuples or confusingly behaving namedtuples. \
 \
So put down that type-less data structures and welcome some class into your \
life! \
 \
python-attrs is the successor to python-characterstic"
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python311-attrs-23.1.0-2.1.noarch.rpm"
RPM_HASH = "edb064a93a08aae63c64af14af833283b50234995002717da293a9c5eb5367a57b8708d251b78a243d5068034e8c8753f434b81e65e52fb6202aed744fa48829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attrs \
python3.11dist-attrs \
python311-attrs \
python3dist-attrs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
