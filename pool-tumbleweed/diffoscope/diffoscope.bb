SUMMARY = "In-depth comparison of files, archives, and directories"
DESCRIPTION = "diffoscope will try to get to the bottom of what makes files or \
directories different. It will recursively unpack archives of many kinds \
and transform various binary formats into more human readable form to \
compare them. It can compare two tarballs, ISO images, or PDF just as \
easily. \
 \
It can be scripted through error codes, and a report can be produced \
with the detected differences. The report can be text or HTML. \
When no type of report has been selected, diffoscope defaults \
to write a text report on the standard output. \
 \
diffoscope is developed as part of the `“reproducible builds” Debian \
project <https://wiki.debian.org/ReproducibleBuilds>`_. \
It is meant to be able to quickly understand why two builds of the same \
package produce different outputs. diffoscope was previously named \
debbindiff."
LICENSE = "GPL-3.0-or-later"

PV = "241"

RPM_NAME = "diffoscope-241-1.2.noarch.rpm"
RPM_HASH = "7085d978ff9029a87726db9f7b350d81bbdd8f95ff7fd473652da0452f961e581390dc3a90d655d6be1b7d144f2d22b0fdb4b3e1327cedb04904d910f0357ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffoscope \
python3.11dist-diffoscope \
python3dist-diffoscope"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-curses \
python3-libarchive-c \
python3-python-magic \
python3-setuptools \
update-alternatives"

inherit rpm
