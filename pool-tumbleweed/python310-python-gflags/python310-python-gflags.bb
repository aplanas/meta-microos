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

RPM_NAME = "python310-python-gflags-3.1.2-2.20.noarch.rpm"
RPM_HASH = "aa02c9491ac2731517a0f442bdc9bd45cb58eae04ac56f6f520eb9d72abec324444da82d604e611a6148e8fa02d04f5e884eb42eb62f71cc58fdc0fe912ca205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-gflags \
python310-python-gflags \
python3dist-python-gflags"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
