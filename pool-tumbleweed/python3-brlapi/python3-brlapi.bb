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

RPM_NAME = "python3-brlapi-6.5-3.1.aarch64.rpm"
RPM_HASH = "1c042ff18c8b3b6c747c78f74a641462dd1aab2201077bd652ac64918e1c8f58c788b2a23822aa123a9d1834c6afec5bea12372134d5dbfdbcf4ac774b395349"

RPROVIDES:${PN} += "python3-brlapi \
python3.11dist-brlapi \
python3dist-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
python-abi"

inherit rpm
