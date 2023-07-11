SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.43"

RPM_NAME = "python310-pykickstart-3.43-2.4.noarch.rpm"
RPM_HASH = "fd344450922d43613c313d3d85ba9a062ec20b0bbf59ba259553b6a8e8fafb5228fab1cca983e14c4d874c6ec65d2ca61eccc0af0705c1a7fbd441a969311a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pykickstart \
python310-pykickstart \
python3dist-pykickstart"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-requests"

inherit rpm
