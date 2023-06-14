SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python38-efl-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "62ecfe69e3b0e1c05b3236ad2618b87178fa5a758da679c02203dc4a959f04feb2fe80c6d7e931a216967530ac3209fa02e097deef4afe3e61e61d4eedd3b4ae"

RPROVIDES:${PN} += "python3.8dist-python-efl \
python38-efl \
python3dist-python-efl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libecore-con.so.1 \
libecore-file.so.1 \
libecore-input.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libedje.so.1 \
libeina.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libeo.so.1 \
libethumb-client.so.1 \
libethumb.so.1 \
libevas.so.1 \
python-abi"

inherit rpm
