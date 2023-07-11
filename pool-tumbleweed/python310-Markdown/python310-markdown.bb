SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.3"

RPM_NAME = "python310-Markdown-3.4.3-2.1.noarch.rpm"
RPM_HASH = "1415624828d1f08f0d325675f77061f48f46482e22c275e242a0ddeb6ababd4e2e44bcbd69fa9a5f3b501008c841090fc48f7b9f8f961dab428d377768ae00d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-markdown \
python310-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
