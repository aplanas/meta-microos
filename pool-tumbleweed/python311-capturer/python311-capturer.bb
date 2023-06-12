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

RPM_NAME = "python311-capturer-3.0-3.1.noarch.rpm"
RPM_HASH = "96d82020b68ddba5af48a941e269934e39ed19e9cd32117e03f2dc965470d5572f6cb7bace26f96ae7a978ffcaf14e3a1bb618ee8580a8c76b03837f718b5801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(capturer) \
python311-capturer \
python3dist(capturer)"
RDEPENDS:${PN} += "python(abi) \
python311-humanfriendly"

inherit rpm
