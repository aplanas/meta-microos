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

RPM_NAME = "python310-python-gflags-3.1.2-2.19.noarch.rpm"
RPM_HASH = "ba3ef0148af0ae80ceae35d87a13c873b7ec464fdb4e84ca3759fb04a8833edf0155186ee81d1211e7f0dca0e63a19008ddc7d9c9ea31c7f02dcf8ca964cf92d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gflags \
python3.10dist-python-gflags \
python310-python-gflags \
python3dist-python-gflags"

RDEPENDS:${PN} += "/bin/sh \
python-abi \
update-alternatives"

inherit rpm
