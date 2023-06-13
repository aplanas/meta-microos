SUMMARY = "Python interface for libkdumpfile"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains all necessary python modules to use libkdumpfile via \
the Python interpreter."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "python39-libkdumpfile-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "ae9f7e4329ba373c00a65ba21bd7f36dbc3af33a79c5bd21b49f9075787fca06c336c7427f75c1c0167a9ab7b55fde1578174d064157e98f9e2e122fee1cbff0"

RPROVIDES:${PN} += "python3.9dist(libkdumpfile) \
python39-libkdumpfile \
python39-libkdumpfile(aarch-64) \
python3dist(libkdumpfile)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libaddrxlat.so.3()(64bit) \
libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) \
libc.so.6()(64bit) \
libkdumpfile.so.10()(64bit) \
libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) \
python(abi)"

inherit rpm
