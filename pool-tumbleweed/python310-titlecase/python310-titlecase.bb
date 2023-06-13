SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python310-titlecase-2.4-1.4.noarch.rpm"
RPM_HASH = "2de60355e79ee9ff9ffd40da32d7bfd7478817074c0e55574d9e3d8f3c0dc354cc3e61ceea41f78998c5ab9cc3f488836f5547eebf4adc3515553d48688c74ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-titlecase \
python3.10dist(titlecase) \
python310-titlecase \
python3dist(titlecase)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-regex \
update-alternatives"

inherit rpm
