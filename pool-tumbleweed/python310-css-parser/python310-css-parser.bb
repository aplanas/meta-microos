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

RPM_NAME = "python310-css-parser-1.0.9-1.1.noarch.rpm"
RPM_HASH = "14d79388c543975d6058c5be2e88bd4aa3ec4a9ace9df7cc56d62c2df4c4e095d8e09b246c58437f4c605f9b9aac21bb594e1dd90390174325bacd57024f481c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-css-parser \
python3.10dist(css-parser) \
python310-css-parser \
python3dist(css-parser)"
RDEPENDS:${PN} += "python(abi) \
python310-chardet"

inherit rpm
