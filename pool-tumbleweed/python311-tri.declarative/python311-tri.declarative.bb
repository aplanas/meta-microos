SUMMARY = "Python class decorators in the style of Django model classes"
DESCRIPTION = "tri.declarative contains class decorators to define classes with \
subclass semantics in the style of django Model classes."
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python311-tri.declarative-5.7.0-1.12.noarch.rpm"
RPM_HASH = "b1116f668338b989ff2f321d04529d38fcf45577d30ee7205db568e60e9e327847b36c0345dd10aa42e3e38cfe701814f911d5945c97375a724204d02f7d1fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tri.declarative \
python3.11dist-tri.declarative \
python311-tri.declarative \
python3dist-tri.declarative"

RDEPENDS:${PN} += "python-abi \
python311-tri.struct"

inherit rpm
