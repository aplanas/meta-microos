SUMMARY = "Library to use BRLTTY from applications -- Python Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "python3-brlapi-6.6-1.1.aarch64.rpm"
RPM_HASH = "80692a42701b567f3ac515b241b2461a2696ce20471b71aa585f8e6e9828505ef83c147d4e94864028c5d3025e8aaaf401b3dea75188edab3282c366a07773f9"

RPROVIDES:${PN} += "python3-brlapi \
python3.11dist-brlapi \
python3dist-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
python-abi"

inherit rpm
