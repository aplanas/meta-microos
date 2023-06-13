SUMMARY = "Python wrapper for Adobe's PostScript autohinter"
DESCRIPTION = "Python wrapper for Adobe's PostScript autohinter"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-psautohint-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "5ade1f0f748f9dccff57aa2fb842b8a057167f493a069d17c8db91375fe4ac85d67e7faba8fbd52e985e7969079761b642733629d2e5d70f299b9caee9b6071e"

RPROVIDES:${PN} += "python3.9dist(psautohint) \
python39-psautohint \
python39-psautohint(aarch-64) \
python3dist(psautohint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-FontTools \
python39-fs \
update-alternatives"

inherit rpm
