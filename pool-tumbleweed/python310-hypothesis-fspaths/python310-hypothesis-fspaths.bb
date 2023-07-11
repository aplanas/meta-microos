SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python310-hypothesis-fspaths-0.1-2.10.noarch.rpm"
RPM_HASH = "cb850afe357d8a49e127a20f9090d30d9b6afae49845c6ee58a0d789c86082f51a73f63ba15916dbaabda40cfb4ef04706a222a3c145c981167b29667bae6625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hypothesis-fspaths \
python310-hypothesis-fspaths \
python3dist-hypothesis-fspaths"

RDEPENDS:${PN} += "python-abi \
python310-hypothesis"

inherit rpm
