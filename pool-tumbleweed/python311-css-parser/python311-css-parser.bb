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

RPM_NAME = "python311-css-parser-1.0.9-1.3.noarch.rpm"
RPM_HASH = "87356a544bd51de50d918a1a625ae4f663fd936b8c9901c2b3fca5f57ce6dcff762d6accd567102dde6ece52ac1ba00819db1c07eb60014bc1f5c9d0312627de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-css-parser \
python3.11dist-css-parser \
python311-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi \
python311-chardet"

inherit rpm
