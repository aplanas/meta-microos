SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.57.0"

RPM_NAME = "python310-memory_profiler-0.57.0-2.13.noarch.rpm"
RPM_HASH = "282e0fbfa0515633febceb649ce6a423f01d4cdf4085e6aa87192afbd5b34c11653e8e1b08250a583c926b254db0e6af77f70a57070b550f455345dd48dd8c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-memory_profiler \
python3.10dist(memory-profiler) \
python310-memory_profiler \
python3dist(memory-profiler)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-psutil \
update-alternatives"

inherit rpm
