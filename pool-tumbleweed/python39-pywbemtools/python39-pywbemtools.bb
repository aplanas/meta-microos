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

RPM_NAME = "python39-pywbemtools-1.1.1-1.3.noarch.rpm"
RPM_HASH = "76b28a9c9d859a40fbf7176524c4d1aac4cb62e9c020bf4669c4054282c57c2940ae9392d0c9a13afe7afc71226f3cf658cfa946abbf55eaf15b7f79d6f2ab7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywbemtools \
python39-pywbemtools \
python3dist-pywbemtools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-asciitree \
python39-click \
python39-click-repl \
python39-click-spinner \
python39-nocasedict \
python39-nocaselist \
python39-packaging \
python39-prompt-toolkit \
python39-psutil \
python39-pyparsing \
python39-pywbem \
python39-six \
python39-tabulate \
python39-toposort \
python39-yamlloader \
update-alternatives"

inherit rpm
