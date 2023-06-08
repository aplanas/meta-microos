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

RPM_NAME = "diffoscope-241-1.1.noarch.rpm"
RPM_HASH = "5027a00fd804274a3f673e329886967f01bd15fdeed0220199512e5fc32dd65c026759b4d8ca7b4a214a7f715664fe2a99e2a5ac72ba4a51f6bb2cff58f31648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffoscope python3.10dist(diffoscope) python3dist(diffoscope)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-curses python3-libarchive-c python3-python-magic python3-setuptools update-alternatives"

inherit rpm
