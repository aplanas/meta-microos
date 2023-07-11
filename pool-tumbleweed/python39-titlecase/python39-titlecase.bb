SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python39-titlecase-2.4-1.6.noarch.rpm"
RPM_HASH = "ec693c34ed969fd4702ad6c0cb2cb965ddb9df88ec1dd126e36a249627b3de8029cf4220976bd428de0a6164919dd0bd53c460c35132d0a0f8b58cb49466ae70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-titlecase \
python39-titlecase \
python3dist-titlecase"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-regex \
update-alternatives"

inherit rpm
