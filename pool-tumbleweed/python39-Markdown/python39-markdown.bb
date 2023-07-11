SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.3"

RPM_NAME = "python39-Markdown-3.4.3-2.1.noarch.rpm"
RPM_HASH = "b192718046971d5b764275cc4ae2df8462079ead95af0812f08a21a78a36d2e8e24b96cf43f3c22d8b244585d2ff6e62dcca30c9e97d283a13b76b373224241f"
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
