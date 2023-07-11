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

RPM_NAME = "python311-py-cpuinfo-9.0.0-2.2.noarch.rpm"
RPM_HASH = "62bda31c1819c9ec53bfe7ae07dd3f97983a50124de24c2f016ab8af6affd433b507e3af241e43bd1d232ba54fa5680a758de82e0cb1d6e48ab33a5b94de4961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-cpuinfo \
python3.11dist-py-cpuinfo \
python311-py-cpuinfo \
python3dist-py-cpuinfo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
