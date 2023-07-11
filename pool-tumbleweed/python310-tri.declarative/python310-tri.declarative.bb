SUMMARY = "Python class decorators in the style of Django model classes"
DESCRIPTION = "tri.declarative contains class decorators to define classes with \
subclass semantics in the style of django Model classes."
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python310-tri.declarative-5.7.0-1.12.noarch.rpm"
RPM_HASH = "5c46dbc2250d708de97831d4bfa8d61d8ffcd6dcc4244043e7142f622e2b46e1dd0a531abfd20d942ce68d5fe20111c2aa57d5d4d5b76aedbffa278ae52e39fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tri.declarative \
python310-tri.declarative \
python3dist-tri.declarative"

RDEPENDS:${PN} += "python-abi \
python310-tri.struct"

inherit rpm
