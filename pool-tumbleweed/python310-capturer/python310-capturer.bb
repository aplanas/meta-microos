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

RPM_NAME = "python310-capturer-3.0-3.1.noarch.rpm"
RPM_HASH = "c7df24db52107059396ca7bb3e84cf0ed1a263c68521597d6d9c419b51b1b48beeacba506bb5dc6bcbe6d5ca63db798db00298607d1ef076e7e9657581eae76e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capturer \
python3.10dist-capturer \
python310-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python310-humanfriendly"

inherit rpm
