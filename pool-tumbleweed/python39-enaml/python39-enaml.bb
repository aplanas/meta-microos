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

RPM_NAME = "python39-enaml-0.16.1-1.1.aarch64.rpm"
RPM_HASH = "a872fb5f72aed6f9ae82696d8e6b701d7c9b3c47449ec8436d615337c7f70a6847c788428ef6126dc7246554ac253380ced429fafd052cccec971b0a93df9e6f"

RPROVIDES:${PN} += "python3.9dist-enaml \
python39-enaml \
python3dist-enaml"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-QtPy \
python39-atom \
python39-bytecode \
python39-kiwisolver \
python39-ply \
update-alternatives"

inherit rpm
