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

RPM_NAME = "python39-pytimeparse-1.1.8-3.12.noarch.rpm"
RPM_HASH = "b53d757cc314f08305200b408a295494438644fe2dd90419b1ccdf651b200fdbf197ef8e4b7fa18ad843c2a5937a2ef9a2a6f7610a934a4958c33458bb3310d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytimeparse \
python39-pytimeparse \
python3dist-pytimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
