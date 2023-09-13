SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-doc-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "ae091575eaa94df884d6d8718668301f9e4e7df6dc32d74b9db29fd0e3d334dd66d52d964e044d547d9e08a10fd021f80e4396c5684b83b8f11d7a50d1badd8c"

RPROVIDES:${PN} += "python39-doc"

RDEPENDS:${PN} += ""

inherit rpm
