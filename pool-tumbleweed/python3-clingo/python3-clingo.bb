SUMMARY = "Python 3 bindings for Clingo"
DESCRIPTION = "This module provides functions and classes to work with ground terms and to \
control the instantiation process. In clingo builts, additional functions to \
control and inspect the solving process are available. \
 \
Functions defined in a python script block are callable during the \
instantiation process using @-syntax. The default grounding/solving process can \
be customized if a main function is provided. \
 \
Detailed information (including a User's manual), source code, and pre-compiled \
binaries are available at: http://potassco.org/"
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "python3-clingo-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "ecdef03bf28d50a9e3801c26e15fa254e5ec7416ce804b59548660c6e64c65c6e1e76381912453d35bc30668bba168edb39f617620263374b85feb9b7b5e8a57"

RPROVIDES:${PN} += "python3-clingo \
python3.11dist-clingo \
python3dist-clingo"

RDEPENDS:${PN} += "clingo \
libc.so.6 \
libclingo.so.4 \
python-abi \
python3-cffi"

inherit rpm
