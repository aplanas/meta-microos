SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python311-mulpyplexer-0.09-1.4.noarch.rpm"
RPM_HASH = "f337358964a0665ebc7f229fd8f6f144f1a5ca024e14242c8d5036afd7b0b7674c37d1793011afe50217a2569417cfe56de749a5af9c7f31c82d157a790ae8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mulpyplexer \
python3.11dist-mulpyplexer \
python311-mulpyplexer \
python3dist-mulpyplexer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
