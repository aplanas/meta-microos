SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.57.0"

RPM_NAME = "python310-memory_profiler-0.57.0-2.14.noarch.rpm"
RPM_HASH = "8d343608e61c71a406dd49b2631ae645b57d5ea483982e74f0619db5f103fe09232b0ca901346eca19558da2304928cdf037e570730770f474ea53acd8cad211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-memory-profiler \
python310-memory-profiler \
python3dist-memory-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-psutil \
update-alternatives"

inherit rpm
