SUMMARY = "Python class decorators in the style of Django model classes"
DESCRIPTION = "tri.declarative contains class decorators to define classes with \
subclass semantics in the style of django Model classes."
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python311-tri.declarative-5.7.0-1.10.noarch.rpm"
RPM_HASH = "1587267c2d2dbbfee2fc4bb9e70dc67e46cf4b23296ff7e47c23d6b1ff2e5284334d3a8c9e06d674f4f1cad8ec50af64476eb02963a46e8bb53747b32e7bd73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tri.declarative) \
python311-tri.declarative \
python3dist(tri.declarative)"

RDEPENDS:${PN} += "python(abi) \
python311-tri.struct"

inherit rpm
