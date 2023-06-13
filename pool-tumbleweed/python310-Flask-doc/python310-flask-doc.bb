SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python310-Flask-doc-2.2.5-1.1.noarch.rpm"
RPM_HASH = "2cb3c82bee32a9138fab15aadbd2e3da4e813c2d11f46fb6f464533445197c6a65c8e27b4e567de9b69b94fd52bafd26e7b13982bfb50bf9f40972b03e4f5bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-doc \
python310-Flask-doc"

RDEPENDS:${PN} += "python310-Flask"

inherit rpm
