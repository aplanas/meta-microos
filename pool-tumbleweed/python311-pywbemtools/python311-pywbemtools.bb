SUMMARY = "Python client tools to work with WBEM Servers using the PyWBEM API"
DESCRIPTION = "Pywbemtools is a collection of command line tools that communicate with WBEM \
servers. The tools are written in pure Python and support Python 2 and Python \
3. \
 \
At this point, pywbemtools includes a single command line tool named \
pywbemcli that uses the python-pywbem package to issue operations to a \
WBEM server using the CIM/WBEM standards defined by the DMTF to perform \
system management tasks."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python311-pywbemtools-1.1.1-1.3.noarch.rpm"
RPM_HASH = "ac3d9a396cb58c6308529dc753f32fcb0403c19b1a1379cb83b36826efe509be916c088d65230ddf5097fa22da068e9a758a27123fcb4694e36ac34409ac83f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywbemtools \
python3.11dist-pywbemtools \
python311-pywbemtools \
python3dist-pywbemtools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-asciitree \
python311-click \
python311-click-repl \
python311-click-spinner \
python311-nocasedict \
python311-nocaselist \
python311-packaging \
python311-prompt-toolkit \
python311-psutil \
python311-pyparsing \
python311-pywbem \
python311-six \
python311-tabulate \
python311-toposort \
python311-yamlloader \
update-alternatives"

inherit rpm
