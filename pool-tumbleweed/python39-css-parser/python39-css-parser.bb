SUMMARY = "CSS related utilities (parsing, serialization, etc) for python"
DESCRIPTION = "CSS related utilities (parsing, serialization, etc) for python \
 \
A fork of the cssutils project based on version 1.0.2. This fork \
includes general bug fixes and extensions specific to editing and \
working with ebooks. \
 \
The main python source code has been modified so that it will run \
without further conversion on both Python >= 2.7 and Python 3.X without \
any further modules required. All required modifications are handled \
local to each file"
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.9"

RPM_NAME = "python39-css-parser-1.0.9-1.1.noarch.rpm"
RPM_HASH = "1a236b39edae875cca7229d9fef1d58f96fa23af96ceca152dcf74ca9abb99fc9a7074d2aa537a3b0dc926209a9683e9f192ae7de1f7def6b2006573b8f41a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-css-parser \
python39-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi \
python39-chardet"

inherit rpm
