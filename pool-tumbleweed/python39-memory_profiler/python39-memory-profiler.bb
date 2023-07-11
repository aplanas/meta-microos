SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.57.0"

RPM_NAME = "python39-memory_profiler-0.57.0-2.14.noarch.rpm"
RPM_HASH = "e862ab7e9f20c3435bd21f89c366659dd50ff32c7ed4716280d2734514e32caeb4bbc029f962491c3622e4eb5fe554e5bab2dc92436f2844ee4ca849ceb0f192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-memory-profiler \
python39-memory-profiler \
python3dist-memory-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-psutil \
update-alternatives"

inherit rpm
