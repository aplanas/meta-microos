SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python38-efl-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "62ecfe69e3b0e1c05b3236ad2618b87178fa5a758da679c02203dc4a959f04feb2fe80c6d7e931a216967530ac3209fa02e097deef4afe3e61e61d4eedd3b4ae"

RPROVIDES:${PN} += "python3.8dist(python-efl) \
python38-efl \
python38-efl(aarch-64) \
python3dist(python-efl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libecore.so.1()(64bit) \
libecore_con.so.1()(64bit) \
libecore_file.so.1()(64bit) \
libecore_input.so.1()(64bit) \
libecore_x.so.1()(64bit) \
libedje.so.1()(64bit) \
libeina.so.1()(64bit) \
libelementary.so.1()(64bit) \
libemotion.so.1()(64bit) \
libeo.so.1()(64bit) \
libethumb.so.1()(64bit) \
libethumb_client.so.1()(64bit) \
libevas.so.1()(64bit) \
python(abi)"

inherit rpm
