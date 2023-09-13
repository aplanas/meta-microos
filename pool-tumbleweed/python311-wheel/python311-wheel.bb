SUMMARY = "A built-package format for Python"
DESCRIPTION = "A built-package format for Python. \
 \
A wheel is a ZIP-format archive with a specially formatted filename \
and the .whl extension. It is designed to contain all the files for a \
PEP 376 compatible install in a way that is very close to the on-disk \
format. Many packages will be properly installed with only the 'Unpack' \
step (simply extracting the file onto sys.path), and the unpacked archive \
preserves enough information to 'Spread' (copy data and scripts to their \
final locations) at any later time."
LICENSE = "MIT"

PV = "0.41.2"

RPM_NAME = "python311-wheel-0.41.2-2.1.noarch.rpm"
RPM_HASH = "1c1bbb5901df1645b51512dde6fd54ac5c3ebec815e99514c8de6cc95e4a783750c3c5c45868e671bf7e6164287e112fc0dbb4b1b3f027a1906390f9ae6166be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheel \
python3.11dist-wheel \
python311-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
