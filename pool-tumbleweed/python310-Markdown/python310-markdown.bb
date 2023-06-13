SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.3"

RPM_NAME = "python310-Markdown-3.4.3-1.2.noarch.rpm"
RPM_HASH = "e5e8de47f1024fa7fcfc20681aacde9840f06d23c97d257586d0a78b846dc57761ae9d2694c04d234ec719d9fa32ffce6fe2764617c8029ccb9a4be0c3d2d75e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markdown \
python3.10dist(markdown) \
python310-Markdown \
python3dist(markdown)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
