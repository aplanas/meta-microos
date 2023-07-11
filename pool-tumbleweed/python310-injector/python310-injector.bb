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

RPM_NAME = "python310-injector-0.20.1-1.5.noarch.rpm"
RPM_HASH = "3508607e67b49addce644804889687bd29a9901a197a6ee0aa15774b7089fc1bd1674980aae99d02d69c97b8187caac2b0c7fd29d39d3797b3a9aec391848c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-injector \
python310-injector \
python3dist-injector"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
