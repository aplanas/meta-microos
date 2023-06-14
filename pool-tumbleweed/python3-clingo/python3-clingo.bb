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

RPM_NAME = "python3-clingo-5.6.2-1.3.aarch64.rpm"
RPM_HASH = "dd2a6d20fc3c01f6ee89ce78ecb05104922fd66ae530df3be1a8cacedae28e67b24983890b9aece84d5011d2379d303ff73316fe12e0b9dc8c2d2e0098d52768"

RPROVIDES:${PN} += "python3-clingo \
python3.10dist-clingo \
python3dist-clingo"

RDEPENDS:${PN} += "clingo \
libc.so.6 \
libclingo.so.4 \
python-abi \
python3-cffi"

inherit rpm
