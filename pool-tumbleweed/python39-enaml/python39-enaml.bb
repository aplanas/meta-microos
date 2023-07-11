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

RPM_NAME = "python39-enaml-0.16.1-1.3.aarch64.rpm"
RPM_HASH = "8acd4173d7847ae3f810128427076fcf69e290fab8e8e3033edbce1fcae143e1bb78c9ef8b3fb626e0117b1d8a627fe35e93f3755affda41cc9e3f14e26c5774"

RPROVIDES:${PN} += "python3.9dist-enaml \
python39-enaml \
python3dist-enaml"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
