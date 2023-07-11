SUMMARY = "OpenStack Profiler Library"
DESCRIPTION = "OSProfiler provides a tiny but powerful library that is used by \
most (soon to be all) OpenStack projects and their python clients. It \
provides functionality to be able to generate 1 trace per request, that goes \
through all involved services. This trace can then be extracted and used \
to build a tree of calls which can be quite handy for a variety of \
reasons (for example in isolating cross-project performance issues). \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "3.4.3"

RPM_NAME = "python3-osprofiler-3.4.3-1.6.noarch.rpm"
RPM_HASH = "54512a9fc15a218d0fe5324d10e808522fff240e3827e9c75124e08b318a8fef621ed0ffbb492102cc21a8040e0939d5120866e6a962b92560aa6afd52fd4e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osprofiler \
python3.11dist-osprofiler \
python3dist-osprofiler"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PrettyTable \
python3-WebOb \
python3-importlib-metadata \
python3-oslo.concurrency \
python3-oslo.config \
python3-oslo.log \
python3-oslo.utils"

inherit rpm
