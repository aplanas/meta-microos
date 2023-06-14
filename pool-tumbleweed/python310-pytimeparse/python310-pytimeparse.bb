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

RPM_NAME = "python310-pytimeparse-1.1.8-3.12.noarch.rpm"
RPM_HASH = "8f6c2ad6ae5a2e8b62f966b18001059035d1e28038190a6e625b8ff6605e0999d4300fda36c906a5d42fe8ecd993eecf66ab0e5382b62ce38915d06694fe2a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytimeparse \
python3.10dist-pytimeparse \
python310-pytimeparse \
python3dist-pytimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
