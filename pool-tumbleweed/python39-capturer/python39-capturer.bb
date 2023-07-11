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

RPM_NAME = "python39-capturer-3.0-3.3.noarch.rpm"
RPM_HASH = "d69374f02467696089dc9af1ae4ffe6e8afe0ec2447bfca1276e9353915b6beef156351d2c7a0fc0463d6e49304faed6a286cdb8619bf759b2d3f99a8e653c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-capturer \
python39-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python39-humanfriendly"

inherit rpm
