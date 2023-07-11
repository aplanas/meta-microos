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

RPM_NAME = "python310-css-parser-1.0.9-1.3.noarch.rpm"
RPM_HASH = "3964ec80baf6a891c8ec56c17086f6b9ecb3ef96218ea69bde4572eac1388aaf261fb4e2bb842bab10ed91a83040be47278648a69d2771f6976a8052941d75a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-css-parser \
python310-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi \
python310-chardet"

inherit rpm
