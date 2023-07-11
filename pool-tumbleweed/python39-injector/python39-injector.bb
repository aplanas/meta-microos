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

RPM_NAME = "python39-injector-0.20.1-1.5.noarch.rpm"
RPM_HASH = "be3a88de76cc6379597df85a37428e3dd68201e7ecf91d1bd9d758f08f7d99fc1951069f9aa8f185a77263e62cf81109722795e9425e690eee096f57a5d6edcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-injector \
python39-injector \
python3dist-injector"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
