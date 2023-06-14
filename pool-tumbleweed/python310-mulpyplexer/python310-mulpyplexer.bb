SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python310-mulpyplexer-0.09-1.3.noarch.rpm"
RPM_HASH = "b5fc004d6b0bd025a2315e704e71842f96088ee7ceaab21b5b3cae86f321238e14d25fbffc09a216b7d415ee8e01418b8e3cd5aa4fe1e9f97849e47866c55205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mulpyplexer \
python3.10dist-mulpyplexer \
python310-mulpyplexer \
python3dist-mulpyplexer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
