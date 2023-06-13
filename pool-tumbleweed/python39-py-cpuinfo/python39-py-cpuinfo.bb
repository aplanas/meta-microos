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

RPM_NAME = "python39-py-cpuinfo-9.0.0-2.1.noarch.rpm"
RPM_HASH = "ef28eb1f9209f24c25da3057e5ded001d6a8ec8b42b27b2ad8f0bd8a70a2fb32ce1961f43f29dc2af865da5a9e7db48e62526c1f2051a31e6b37e57737b754d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py-cpuinfo) \
python39-py-cpuinfo \
python3dist(py-cpuinfo)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
