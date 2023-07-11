SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.57.0"

RPM_NAME = "python311-memory_profiler-0.57.0-2.14.noarch.rpm"
RPM_HASH = "5551ec48ec31a7d84c9e50341a005eb986336ea0952f1e585babdda7606b10f8677bf22bad5b329506593d85a96d5366beebea4b9bdb64d100bf9b5e0c5a0b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-memory-profiler \
python3.11dist-memory-profiler \
python311-memory-profiler \
python3dist-memory-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-psutil \
update-alternatives"

inherit rpm
