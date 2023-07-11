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

RPM_NAME = "python311-translate-toolkit-3.8.6-1.4.noarch.rpm"
RPM_HASH = "2ce31727ffc43554a42a736a1628f3e5314c9ab5011fa461000ca690f229a354eb49836dc2381ad20270ad576cdbcb558beb236bbb70ae21a09f6df132f049b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translate-toolkit \
python3.11dist-translate-toolkit \
python311-translate-toolkit \
python3dist-translate-toolkit \
translate-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
gettext-runtime \
python-abi \
python311 \
python311-lxml \
python311-setuptools \
update-alternatives"

inherit rpm
