SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python310-mulpyplexer-0.09-1.4.noarch.rpm"
RPM_HASH = "4c162563766d34aa70a023005387e528df70707349cb3adeb41bbb4961631f2fe845dcf030906028d5b0021f36ab9decdb77e4f075f0660e81bca4386ffcca61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mulpyplexer \
python310-mulpyplexer \
python3dist-mulpyplexer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
