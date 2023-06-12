SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-rebulk-3.2.0-1.2.noarch.rpm"
RPM_HASH = "0ee007885005db08c60a5b685ef0b2de102538991d0bf59fdb94576992789501e7ee211fe2a821da255ad4470c40bb74292b653d1b76d7ee0574b4cf8bc4b2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rebulk \
python3.10dist(rebulk) \
python310-rebulk \
python3dist(rebulk)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
