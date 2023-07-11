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

RPM_NAME = "python311-enaml-0.16.1-1.3.aarch64.rpm"
RPM_HASH = "deba7a17e5477b77ab08113036071d067366d78ef62f38507bfc906e0044bfe6585d8ee92356434a149971151b046e5b6ebccf50cf84a303c8dabd8b083e3f0d"

RPROVIDES:${PN} += "python3-enaml \
python3.11dist-enaml \
python311-enaml \
python3dist-enaml"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-QtPy \
python311-atom \
python311-bytecode \
python311-kiwisolver \
python311-ply \
update-alternatives"

inherit rpm
