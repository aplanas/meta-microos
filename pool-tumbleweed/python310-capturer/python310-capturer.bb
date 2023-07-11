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

RPM_NAME = "python310-capturer-3.0-3.3.noarch.rpm"
RPM_HASH = "c69729a6ed2ff857a1f9d1b739edbc809561af14646b9326d92d2da76fb56bef027211c509ff655e483a4df7437c9e833d2b885799bbb1cf5c449637914d7c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-capturer \
python310-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python310-humanfriendly"

inherit rpm
