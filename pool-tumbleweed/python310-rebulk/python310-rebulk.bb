SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-rebulk-3.2.0-1.4.noarch.rpm"
RPM_HASH = "137ec78503f19dfa0a57f28b627a9f4f1bcf8bfe2d89ec1208aa9e155ae9cbfbee7fe7eb5e7b42b39b3a4be2adef27b2d63a0da1620dfac6a31925520eb7c320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rebulk \
python310-rebulk \
python3dist-rebulk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
