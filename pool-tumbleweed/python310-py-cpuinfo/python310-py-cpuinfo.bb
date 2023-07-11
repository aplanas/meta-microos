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

RPM_NAME = "python310-py-cpuinfo-9.0.0-2.2.noarch.rpm"
RPM_HASH = "13eebf1bbce6211afc796964c2b5381dd31e0b05617695034425fbe9ea5be4ce61d4fd39891041fde9c9e07ae736842020dcaf7769682a94afb377f9b5d7033b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-cpuinfo \
python310-py-cpuinfo \
python3dist-py-cpuinfo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
