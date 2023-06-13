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

RPM_NAME = "python310-translate-toolkit-3.8.6-1.2.noarch.rpm"
RPM_HASH = "6b775f37b7bcdb94028904f25fa9fda7a477ff02aeb40787c381e3781dbce91e8b9a8624470f4b74cc132ab8965d40b83435adbf5519665f846c576b9e4e35dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translate-toolkit \
python3.10dist(translate-toolkit) \
python310-translate-toolkit \
python3dist(translate-toolkit) \
translate-toolkit"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.10 \
gettext-runtime \
python(abi) \
python310 \
python310-lxml \
python310-setuptools \
update-alternatives"

inherit rpm
