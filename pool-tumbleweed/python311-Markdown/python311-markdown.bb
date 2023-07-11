SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.3"

RPM_NAME = "python311-Markdown-3.4.3-2.1.noarch.rpm"
RPM_HASH = "49abb71d449b8728f7d397019598d2abb031038a222418cc73712b31cdb73723f984f7bb88084388fda6bf3085d1bafcfdee7e16db123d4b4a8f6527306d6a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markdown \
python3.11dist-markdown \
python311-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
