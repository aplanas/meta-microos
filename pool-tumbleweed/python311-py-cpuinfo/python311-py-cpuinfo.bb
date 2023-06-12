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

RPM_NAME = "python311-py-cpuinfo-9.0.0-2.1.noarch.rpm"
RPM_HASH = "2e0b3eb5fbfbd5b5ee429f700b34b7969991db68031953cd4150a4a568d58efac07fbc4ff9828342df879ce0e379d56fdd1229492d8e3a18265eaff1bd9ff910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py-cpuinfo) \
python311-py-cpuinfo \
python3dist(py-cpuinfo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
