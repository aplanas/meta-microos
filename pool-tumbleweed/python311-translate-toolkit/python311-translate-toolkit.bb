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

RPM_NAME = "python311-translate-toolkit-3.8.6-1.2.noarch.rpm"
RPM_HASH = "f57eb3bd00fd1fd7fcf3771b8c7679c2e0cc68b806a3510965b8e0d7e437db3aa258a8f2cabc773a5fa707c4b36f964454e1f8f1ff05fe1e5566dbf48552780b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(translate-toolkit) \
python311-translate-toolkit \
python3dist(translate-toolkit)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.11 \
gettext-runtime \
python(abi) \
python311 \
python311-lxml \
python311-setuptools \
update-alternatives"

inherit rpm
