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

PV = "3.9.2"

RPM_NAME = "python310-translate-toolkit-3.9.2-1.1.noarch.rpm"
RPM_HASH = "e6ea87981d628dfa25b42104663957a357519f0dd49670a2070672ef8d2819e9bd6239e5b60f34fa6a63775da66f2a62ce201cc6d8071bd50f936b4b22f86ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-translate-toolkit \
python310-translate-toolkit \
python3dist-translate-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
gettext-runtime \
python-abi \
python310 \
python310-lxml \
python310-setuptools \
update-alternatives"

inherit rpm
