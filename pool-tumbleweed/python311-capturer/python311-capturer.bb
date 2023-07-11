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

RPM_NAME = "python311-capturer-3.0-3.3.noarch.rpm"
RPM_HASH = "66d44a4eb331e3c287d34e7e2042f486839287a0cd1ec7bf293e574d0eac54d41cf908e793d6a0b60fde204a0e82f52fc2e68e9c13516b123552338565ffeb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capturer \
python3.11dist-capturer \
python311-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python311-humanfriendly"

inherit rpm
