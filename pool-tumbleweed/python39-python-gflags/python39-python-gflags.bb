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

RPM_NAME = "python39-python-gflags-3.1.2-2.19.noarch.rpm"
RPM_HASH = "2f5e1d98e1279c835533984281b85181992c6896df9797055993fbe8fdf5e33d20679634f0cd686073a7c2b56bbcb80b44905ab112859ae9a547a2361ea31465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-gflags) \
python39-python-gflags \
python3dist(python-gflags)"

RDEPENDS:${PN} += "/bin/sh \
python(abi) \
update-alternatives"

inherit rpm
