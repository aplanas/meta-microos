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

RPM_NAME = "python311-python-gflags-3.1.2-2.20.noarch.rpm"
RPM_HASH = "559ffc0e9220a29165752594c2ffdff4d07af38d3959d157dacc30b3bdf26ee402f1b032643539e37e4102f4d099a2e170782389a5c34a45b363f56df8e18b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gflags \
python3.11dist-python-gflags \
python311-python-gflags \
python3dist-python-gflags"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
