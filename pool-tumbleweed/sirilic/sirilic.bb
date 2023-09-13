SUMMARY = "Software that uses SiriL for preparing acquisition files for processing"
DESCRIPTION = "SiriLic ( SiriL Image Converter) is a software for preparing \
acquisition files (raw, Offset, Flat and Dark) for processing with SiriL software. \
It does three things: \
* Structuring the SiriL working directory into sub-folders \
* Convert Raw, Offset, Dark or Flat files into SiriL sequence \
* Automatically generate the SiriL script according to the files present and the options \
Sirilic allows also to batch process multiple channel and sessions."
LICENSE = "LGPL-3.0-or-later"

PV = "1.15.7"

RPM_NAME = "sirilic-1.15.7-1.1.noarch.rpm"
RPM_HASH = "c914b6edb7394dd74844398eae7822298463fd5c9bec92cd8844bbfadd274bebaab9d093915febe00db41f3b930fcae615ffa91bf983aaf5d37c91e5a8258ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sirilic \
python3dist-sirilic \
sirilic"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-wxPython \
siril"

inherit rpm
