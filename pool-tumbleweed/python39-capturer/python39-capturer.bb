SUMMARY = "Python module for capturing stdout/stderr of the current process group"
DESCRIPTION = "The capturer package captures the stdout and stderr streams \
of the current process *and subprocesses*. Output can be relayed to the \
terminal in real time, but is also available to the Python program for \
additional processing. It's currently tested on cPython 2.6, 2.7, 3.4, 3.5, 3.6 \
and PyPy (2.7). It's tested on Linux and Mac OS X and may work on other unixes \
but definitely won't work on Windows (due to the use of the platform dependent \
'pty' module)."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "python39-capturer-3.0-3.1.noarch.rpm"
RPM_HASH = "3bf16b3512f1bad531bce873aa343fab208dedec2e7f3f5bc19f74d806f52624048a564ba1c9fe751eb6a975d1394c7136dea85f9647357ed9fae223d05a430a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-capturer \
python39-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python39-humanfriendly"

inherit rpm
