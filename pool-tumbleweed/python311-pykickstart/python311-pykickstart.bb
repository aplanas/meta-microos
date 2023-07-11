SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.43"

RPM_NAME = "python311-pykickstart-3.43-2.4.noarch.rpm"
RPM_HASH = "88376cf225c3701c8d1f575b082957cf05dce09fbc8070beae9df9ef9ce773d055eccffdb6ea2b390517afe721570553b18350038eb82da267f70c6c54432c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykickstart \
python3.11dist-pykickstart \
python311-pykickstart \
python3dist-pykickstart"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-requests"

inherit rpm
