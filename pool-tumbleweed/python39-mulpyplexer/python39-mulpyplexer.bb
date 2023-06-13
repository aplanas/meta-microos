SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python39-mulpyplexer-0.09-1.3.noarch.rpm"
RPM_HASH = "0d23949211a03976d253dae1647e20a79c18c90a40f4e1d6e284153fdb098a1722b07fd38f952a397da1b5f4764a2685f02c95c06bc0541147664f40fb66e2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mulpyplexer) \
python39-mulpyplexer \
python3dist(mulpyplexer)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
