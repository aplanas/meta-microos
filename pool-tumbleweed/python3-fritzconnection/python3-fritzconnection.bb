SUMMARY = "A Python module to talk to a AVM fritzbox"
DESCRIPTION = "fritzconnection is a Python library to communicate with the AVM \
Fritz!Box by the TR-064 protocol. \
This allows to read status-informations from the box and to read \
and change configuration settings and state."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python3-fritzconnection-1.10.3-1.2.noarch.rpm"
RPM_HASH = "61acd67ad7093ea0eb110c70adef0d164ba157966d72d569a3d83c1290da18470db48dd887ac5383b04439c5008fdf1d72c50c18f80ea96237bba18ae284f359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fritzconnection \
python3.10dist(fritzconnection) \
python3dist(fritzconnection)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-lxml \
python3-requests \
python3-setuptools"

inherit rpm
