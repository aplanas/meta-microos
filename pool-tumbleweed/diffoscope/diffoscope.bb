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

PV = "242"

RPM_NAME = "diffoscope-242-1.1.noarch.rpm"
RPM_HASH = "d6c51818fa632142768d06a29277ce1c5522987eb06d1bcab04da735b25576e57987d72694915f9652a7defab7b9bf78a0e3323ba4e11425e021d57efd8b4b42"
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
