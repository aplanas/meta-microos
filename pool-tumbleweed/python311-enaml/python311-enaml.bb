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

RPM_NAME = "python311-enaml-0.16.1-1.1.aarch64.rpm"
RPM_HASH = "349949ab6ec7f3f867f4142ebe348742cdedf0cc8c8fbc5b4a1101ef19dbbd635b2e9209bf1645768ded8ebb2278bc9c37e6c730ecdcd503a249dd0de524a347"

RPROVIDES:${PN} += "python3.11dist-enaml \
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
