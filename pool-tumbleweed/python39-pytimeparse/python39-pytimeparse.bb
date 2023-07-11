SUMMARY = "Time expression parser"
DESCRIPTION = "A small Python library to parse various kinds of time expressions, \
inspired by a StackOverflow question. \
 \
The single function pytimeparse.timeparse.timeparse defined in the \
library (also available as pytimeparse.parse) parses time expressions \
like the following: \
 \
  * 32m \
  * 2h32m \
  * 3d2h32m \
  * 1w3d2h32m \
  * 1w 3d 2h 32m \
  * 1 w 3 d 2 h 32 m \
  * ... \
 \
It returns the time as a number of seconds (an integer value if \
possible, otherwise a floating-point number) \
 \
A number of seconds can be converted back into a string using the \
datetime module in the standard library."
LICENSE = "MIT"

PV = "1.1.8"

RPM_NAME = "python39-pytimeparse-1.1.8-3.14.noarch.rpm"
RPM_HASH = "08187c73de3177e321bffd52b2133655720fadeed41a2aff2a76cbaad058952340567802c5846c7c26b42a6a47625be1a308fc1072125c67a21f69a4a6ad1147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytimeparse \
python39-pytimeparse \
python3dist-pytimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
