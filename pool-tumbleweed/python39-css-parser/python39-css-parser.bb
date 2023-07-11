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

RPM_NAME = "python39-css-parser-1.0.9-1.3.noarch.rpm"
RPM_HASH = "3c972c7a7a21ebb1fe1906a24ab32500502ac4888423e12a701ae7e0e034f4d5a59027685ac89019479467577e99246e8d0dc54f60d2447cc17d80474e0205ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-css-parser \
python39-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi \
python39-chardet"

inherit rpm
