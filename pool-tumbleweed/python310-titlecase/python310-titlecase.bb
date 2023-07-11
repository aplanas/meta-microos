SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python310-titlecase-2.4-1.6.noarch.rpm"
RPM_HASH = "888725b11d7e834849297999367161ef3f3e4c2f63048d8db26df8eb03129f67d71ee77eab8a51c55929fa2ab7f3ec9a91f0e91cdfeee3a23f32ec4fde5dc70e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-titlecase \
python310-titlecase \
python3dist-titlecase"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-regex \
update-alternatives"

inherit rpm
