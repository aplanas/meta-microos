SUMMARY = "Tools and API to assist with translation and software localization"
DESCRIPTION = "The Translate Toolkit is a set of software and documentation designed to help \
make the lives of localizers both more productive and less frustrating. \
 \
The software includes programs to convert localization formats to the common \
PO, and emerging XLIFF format.  There are also programs to check and manage PO \
and XLIFF files.  Online documentation includes guides on using the tools, \
running a localization project and how to localize various projects from \
OpenOffice.org to Mozilla. \
 \
At its core the software contains a set of classes for handling various \
localization storage formats: DTD, properties, OpenOffice.org GSI/SDF, \
CSV, MO, Qt .ts, TMX, TBX, WordFast txt, Gettext .mo, Windows RC, and \
of course PO and XLIFF.  It also provides scripts to convert between \
these formats. \
 \
Also part of the Toolkit are Python programs to create word counts, merge \
translations and perform various checks on translation files."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "python39-translate-toolkit-3.8.6-1.4.noarch.rpm"
RPM_HASH = "7aa0cb5b805011e33080900d148b6921689d7f255e2b0785f9af69b9c0b70ca25556b667626686adb415e7f38d5647043f966724f280a8bf0e1852845710834b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-translate-toolkit \
python39-translate-toolkit \
python3dist-translate-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
gettext-runtime \
python-abi \
python39 \
python39-lxml \
python39-setuptools \
update-alternatives"

inherit rpm
