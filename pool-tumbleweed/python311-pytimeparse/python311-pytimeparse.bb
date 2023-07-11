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

RPM_NAME = "python311-pytimeparse-1.1.8-3.14.noarch.rpm"
RPM_HASH = "8482a98dde50cd3ad807e586c57ed9f4feb24084886439f9f735b19854ec61243fe1465f4204ba17be0670d9a85aca3e62d76ec96847e32ef59c379917c836fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytimeparse \
python3.11dist-pytimeparse \
python311-pytimeparse \
python3dist-pytimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
