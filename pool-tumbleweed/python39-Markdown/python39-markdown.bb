SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python39-Markdown-3.4.4-1.1.noarch.rpm"
RPM_HASH = "8d5b783b094cad9954d44e4935243f0a99b7c3527da60e0e2a3e8f03b923d1719bba6b259fdab34eafa85ebe860f8b55f15cb7d82f18c7359033b2816d978a24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markdown \
python39-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-importlib-metadata \
update-alternatives"

inherit rpm
