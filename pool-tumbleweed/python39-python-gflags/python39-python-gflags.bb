SUMMARY = "Google Commandline Flags Module"
DESCRIPTION = "This project is the python equivalent of google-gflags, a Google commandline \
flag implementation for C++. It is intended to be used in situations where a \
project wants to mimic the command-line flag handling of a C++ app that uses \
google-gflags, or for a Python app that, via swig or some other means, is \
linked with a C++ app that uses google-gflags. \
 \
The gflags package contains a library that implements commandline flags \
processing. As such it's a replacement for getopt(). It has increased \
flexibility, including built-in support for Python types, and the ability to \
define flags in the source file in which they're used. (This last is its major \
difference from OptParse.)"
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python39-python-gflags-3.1.2-2.20.noarch.rpm"
RPM_HASH = "e373c809abc17a30aa814a11cf839c8ad684dcd24be5cda6b72f0100a922ad99fb6093fb3973bc8fcfe48ade36b99aa345e939c537dd268f0b47febbea0019c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-gflags \
python39-python-gflags \
python3dist-python-gflags"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
