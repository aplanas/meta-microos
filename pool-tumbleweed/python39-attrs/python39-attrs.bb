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

RPM_NAME = "python39-attrs-23.1.0-2.1.noarch.rpm"
RPM_HASH = "5a1e59141099303fa8a1df8e0b43b50141d937b15d2c062d5b5421c096e8ea817c1779444f9886fd5eae3af7c35010ba91a1baa026fb015d74541b85045f37ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-attrs \
python39-attrs \
python3dist-attrs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
