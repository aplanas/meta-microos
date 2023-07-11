SUMMARY = "HTML documentation and examples for python-rtmidi"
DESCRIPTION = "Contains HTML documentation and examples for python-rtmidi."
LICENSE = "MIT"

PV = "1.4.9"

RPM_NAME = "python310-python-rtmidi-doc-1.4.9-3.1.noarch.rpm"
RPM_HASH = "6878b1a209a9e270cba74b4327648c29f002b765d35cc637124c5c8223f5bfc782182f1fa93990886d6fbe3b4291285eacd32be8a91f5da4a07f19e14a93af4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-python-rtmidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
