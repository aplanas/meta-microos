SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-xerox-0.4.1-2.16.noarch.rpm"
RPM_HASH = "fa821e8d7283fab3a07d6c8e333cd540a11a663b4ef37d87163c5fa49e4a612a89472dca903d73d683d1ff656d015e1c9943ee1aceec192657142167ffe51cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xerox \
python310-xerox \
python3dist-xerox"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives \
xclip"

inherit rpm
