SUMMARY = "Python library and tool to get CPU info"
DESCRIPTION = "Py-cpuinfo gets CPU info with pure Python. Py-cpuinfo should work \
without any extra programs or libraries, beyond what your OS \
provides. It supports Linux, OS X, Windows, BSD, Solaris, \
Cygwin, Haiku, and BeagleBone, but only on x86 and some ARM CPUs. \
 \
These approaches are used for getting info: \
 1. Windows Registry (Windows) \
 2. /proc/cpuinfo (Linux) \
 3. sysctl (OS X) \
 4. dmesg (Unix/Linux) \
 5. isainfo and kstat (Solaris) \
 6. cpufreq-info (BeagleBone) \
 7. lscpu (Unix/Linux) \
 8. sysinfo (Haiku) \
 9. Querying the CPUID register (Intel X86 CPUs)"
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-py-cpuinfo-9.0.0-2.2.noarch.rpm"
RPM_HASH = "ce0791d1bf11b0c9e7ce92b0490db7a7ce72e3463f144299762e2925daafa32ef516c414e16d83a9af1955fae7e71ac971979d8b8a94834e6345bffb4761c230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-cpuinfo \
python39-py-cpuinfo \
python3dist-py-cpuinfo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
