SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "LGPL-2.1-or-later | BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python311-progressbar-2.5-3.1.noarch.rpm"
RPM_HASH = "e96ef76ffeafe8b289b87448bf5b88c2e7bf0b8f4aea8d6b6bd8a0514c49a9bb7f4a899b7594e1a8091f3d48d00be2943752703b6b79f58f530c93ae5ca9f095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progressbar \
python3.11dist-progressbar \
python311-progressbar \
python3dist-progressbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
