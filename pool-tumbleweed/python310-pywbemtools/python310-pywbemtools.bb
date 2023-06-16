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

RPM_NAME = "python310-pywbemtools-1.1.1-1.2.noarch.rpm"
RPM_HASH = "8bfec74a2337dfdc9359f6839874675a9f9fd2688f2b5c18b86940cb32444f06bf519ee0985574048cdd3e669c926f765125608f12754382afc2ea1eb8064252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywbemtools \
python3.10dist-pywbemtools \
python310-pywbemtools \
python3dist-pywbemtools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-asciitree \
python310-click \
python310-click-repl \
python310-click-spinner \
python310-nocasedict \
python310-nocaselist \
python310-packaging \
python310-prompt-toolkit \
python310-psutil \
python310-pyparsing \
python310-pywbem \
python310-six \
python310-tabulate \
python310-toposort \
python310-yamlloader \
update-alternatives"

inherit rpm
