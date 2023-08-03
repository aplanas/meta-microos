SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python310-Markdown-3.4.4-1.1.noarch.rpm"
RPM_HASH = "d31d4a29c7a526d60dd0a314735248370c87026a8ee9314d29cdf4aafe820481bf919f325972c7c6bd8e19b31c1586d7b3be5d4b4c18419685e3833b15d94aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-markdown \
python310-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
