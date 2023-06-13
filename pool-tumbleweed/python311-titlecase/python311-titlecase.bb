SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python311-titlecase-2.4-1.4.noarch.rpm"
RPM_HASH = "4f34714cb53f08eaf172093fc6ca79f9adeac7e47ff2c37093d08fc84093c9d927923932214ce79cb15a8e79113ed58e2b63434bf30e46622131044cb14abf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(titlecase) \
python311-titlecase \
python3dist(titlecase)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-regex \
update-alternatives"

inherit rpm
