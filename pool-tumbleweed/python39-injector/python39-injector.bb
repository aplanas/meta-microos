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

RPM_NAME = "python39-injector-0.20.1-1.3.noarch.rpm"
RPM_HASH = "9cc5b822bb3f4712ec5880dcbcf44efca71f066b8a4bddae01e5d9ff844f2c724175b89f0793f8e8b3ddc0c13c652e818db6929ae04b39b29fdb311df8b93ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(injector) \
python39-injector \
python3dist(injector)"

RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm
