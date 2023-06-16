SUMMARY = "Base package on which Jupyter projects rely"
DESCRIPTION = "Core common functionality of Jupyter projects. \
 \
This package contains base application classes and configuration inherited by \
other projects. It doesn't do much on its own. \
 \
There is no reason to install this package on its own.  It will be pulled in \
as a dependency by packages that require it."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "python310-jupyter-core-5.3.0-1.2.noarch.rpm"
RPM_HASH = "65d3cecff9f5eeed0182655ab4935a57cc76b0b0df786e6c5f36f2036df7fe02cee03ea214401bc37882fa09dcfc76a53963e84d1e976bcc7e024ace62bfe752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-core \
python3-jupyter-core \
python3.10dist-jupyter-core \
python310-jupyter-core \
python3dist-jupyter-core"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-platformdirs \
python310-traitlets"

inherit rpm
