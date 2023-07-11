SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python39-mulpyplexer-0.09-1.4.noarch.rpm"
RPM_HASH = "f94f3f26c9bc275fe591c81dc25e2a7750602a02abd4bc4fff20f22b8899d72a8bfa778cef18592203f518de9e9e926c0406bc33545922b29bf59d3b7f0453d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mulpyplexer \
python39-mulpyplexer \
python3dist-mulpyplexer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
