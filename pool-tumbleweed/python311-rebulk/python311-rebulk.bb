SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-rebulk-3.2.0-1.4.noarch.rpm"
RPM_HASH = "9a00b4df84b0aea94fef28aa786b270d32ce5d2a2b89cdf46955e1f01bdd0cc39e6572bad9e77e4e9740b80ec3420f8addc78087feb50395971a7e9e2a5f47da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rebulk \
python3.11dist-rebulk \
python311-rebulk \
python3dist-rebulk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
