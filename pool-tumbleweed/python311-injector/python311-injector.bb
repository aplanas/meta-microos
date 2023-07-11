SUMMARY = "Python dependency injection framework, inspired by Guice"
DESCRIPTION = "Dependency injection as a formal pattern is less useful in Python than \
in other languages, primarily due to its support for keyword \
arguments, the ease with which objects can be mocked, and its dynamic \
nature. \
 \
That said, a framework for assisting in this process can remove a lot \
of boiler-plate from larger applications. That's where Injector can \
help. It automatically and transitively provides keyword arguments \
with their values. As an added benefit, Injector encourages nicely \
compartmentalised code through the use of Module s. \
 \
While being inspired by Guice, it does not slavishly replicate its \
API. Providing a Pythonic API trumps faithfulness."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python311-injector-0.20.1-1.5.noarch.rpm"
RPM_HASH = "9f2c00d3372a8780a354092534224aaedf01924827e2e4ee2abb3c5bc91616a21b9e66420a80c49a0ebf8f4f0ae1048aca29ad0963f73e73fb8786e856eda2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-injector \
python3.11dist-injector \
python311-injector \
python3dist-injector"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
