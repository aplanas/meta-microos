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

RPM_NAME = "python310-attrs-23.1.0-1.1.noarch.rpm"
RPM_HASH = "c386632017828bb22e15bc5b8343c3ddfcd32f8c312699f865e3fc2acea2a3e3b871412ba7248ca68e78b18d6687fd0f231d085800413d7c4688cdb166c505c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attrs \
python3.10dist(attrs) \
python310-attrs \
python3dist(attrs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
