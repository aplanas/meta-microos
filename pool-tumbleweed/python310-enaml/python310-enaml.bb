SUMMARY = "Declarative DSL for building rich user interfaces in Python"
DESCRIPTION = "Enaml is a programming language and framework for creating \
professional quality user interfaces with minimal effort. \
Enaml combines a domain specific declarative language with \
a constraints based layout system to allow users to easily \
define rich UIs with complex and flexible layouts. Enaml \
applications can be run on any platform which supports \
Python and Qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "0.16.1"

RPM_NAME = "python310-enaml-0.16.1-1.1.aarch64.rpm"
RPM_HASH = "36f753f93d6b0b9a0bca152bd38ef81f16f082045e6eee37a5b10f4be00128a81a92915a7118ac26922197a9d46dd970cef6a366a720e2ce4454abbec31c53f7"

RPROVIDES:${PN} += "python3-enaml \
python3.10dist-enaml \
python310-enaml \
python3dist-enaml"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-QtPy \
python310-atom \
python310-bytecode \
python310-kiwisolver \
python310-ply \
update-alternatives"

inherit rpm
