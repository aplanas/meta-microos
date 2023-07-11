SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python311-titlecase-2.4-1.6.noarch.rpm"
RPM_HASH = "50f53847e6f24cd55be2f39f63e46b5cfba6369af30379860fa3b543fbbca4f577357dc79f8027b7f0ade9bd6f53292e2295c5faf2d104fdcb7279508d552c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-titlecase \
python3.11dist-titlecase \
python311-titlecase \
python3dist-titlecase"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-regex \
update-alternatives"

inherit rpm
