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

RPM_NAME = "python311-python-gflags-3.1.2-2.19.noarch.rpm"
RPM_HASH = "18b21edcbd5f2c94f5b179d2db0f4226ab637866591a094334fafa0ead9c9b10f9169402484e0ebae33e2fb5dd531289453b9d4854dade7f9809a8e8ae22ea09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-gflags) \
python311-python-gflags \
python3dist(python-gflags)"
RDEPENDS:${PN} += "/bin/sh \
python(abi) \
update-alternatives"

inherit rpm
