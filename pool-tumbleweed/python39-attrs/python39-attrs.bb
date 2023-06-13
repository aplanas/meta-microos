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

RPM_NAME = "python39-attrs-23.1.0-1.1.noarch.rpm"
RPM_HASH = "7c138b44d5477229cc5d222325b8f336dddb85a8afa10176fc55bbd294ce9f9469a5ea4fdf5f7a10cb38b54d377153b2dae5629838642fb1cde7fa332d452a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(attrs) \
python39-attrs \
python3dist(attrs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
