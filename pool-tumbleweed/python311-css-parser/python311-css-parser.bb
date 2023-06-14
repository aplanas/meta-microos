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

RPM_NAME = "python311-css-parser-1.0.9-1.1.noarch.rpm"
RPM_HASH = "f3610bed456e40fda34734d1fea4f6d64bce0fced0f2170d8d3677799928435215fdf43d4b9b39dcfd80fa29d4ea9db4f39394415809a150b6006f6b30edd431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-css-parser \
python311-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi \
python311-chardet"

inherit rpm
