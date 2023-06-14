SUMMARY = "Python class decorators in the style of Django model classes"
DESCRIPTION = "tri.declarative contains class decorators to define classes with \
subclass semantics in the style of django Model classes."
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python39-tri.declarative-5.7.0-1.10.noarch.rpm"
RPM_HASH = "375027b7df67ae6456b8033e1d8829a7bc96b9f1c3347e1f90aa434db166290071cc9f0999cc178588eded891e77219ea97d9a9b163ac48ebeb1c78a4eb2b066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tri.declarative \
python39-tri.declarative \
python3dist-tri.declarative"

RDEPENDS:${PN} += "python-abi \
python39-tri.struct"

inherit rpm
