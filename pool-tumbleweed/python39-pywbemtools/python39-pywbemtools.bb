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

RPM_NAME = "python39-pywbemtools-1.1.1-1.2.noarch.rpm"
RPM_HASH = "1f22de8dd1c66a2057c00506457d4e47cb6d7ac26b7d3f0c06f032d3889334aac46e3c1cd4a698e7048bc4d68f941faf1f996c0cb37ee363ffa76f8195be192e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pywbemtools) \
python39-pywbemtools \
python3dist(pywbemtools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-asciitree \
python39-click \
python39-click-repl \
python39-click-spinner \
python39-nocasedict \
python39-nocaselist \
python39-packaging \
python39-prompt_toolkit \
python39-psutil \
python39-pyparsing \
python39-pywbem \
python39-six \
python39-tabulate \
python39-toposort \
python39-yamlloader \
update-alternatives"

inherit rpm
