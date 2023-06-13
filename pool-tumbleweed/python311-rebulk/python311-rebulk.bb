SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-rebulk-3.2.0-1.2.noarch.rpm"
RPM_HASH = "447fc3fe3d01e867603c63b66c31b0b197da41eb7522b0ded6e5382776ab8058cb199cc7cfa85a3abb064cc0dcfd25eb3a07d93dbf1ef4b7c6bdc983c100a85f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rebulk) \
python311-rebulk \
python3dist(rebulk)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
