SUMMARY = "Python class decorators in the style of Django model classes"
DESCRIPTION = "tri.declarative contains class decorators to define classes with \
subclass semantics in the style of django Model classes."
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python39-tri.declarative-5.7.0-1.12.noarch.rpm"
RPM_HASH = "11954622a4bb89366085b93f239fe4a28ee824451a73466424aaad312ab4da5b2d060dae484be64f1c3c2ec8bc514515bd2c2eca7bb4480891de8cdcb582f257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tri.declarative \
python39-tri.declarative \
python3dist-tri.declarative"

RDEPENDS:${PN} += "python-abi \
python39-tri.struct"

inherit rpm
