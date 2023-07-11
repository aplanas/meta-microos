SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-tkreadonly-0.6.1-2.13.noarch.rpm"
RPM_HASH = "913b2211cab61f5d5f4eb2895460e52490273bb9e2338f6b7b0f76eff8951ee4928b7325660f14407ce8327f2febee222d373347cf0f7412bb5b7d2b2efe18ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tkreadonly \
python39-tkreadonly \
python3dist-tkreadonly"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-idle \
python39-tk"

inherit rpm
