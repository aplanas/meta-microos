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

PV = "6.5"

RPM_NAME = "python3-brlapi-6.5-2.4.aarch64.rpm"
RPM_HASH = "deef26c1f8c534f38a1d6d9e8ef2c21166595b9491b648e59b1623813012ce3d5bb848f2874131fc8069478ebbf01eaa21b72d67409e589fb43298f6d12d4fbd"

RPROVIDES:${PN} += "python3-brlapi \
python3.10dist-brlapi \
python3dist-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
python-abi"

inherit rpm
