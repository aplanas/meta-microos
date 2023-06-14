SUMMARY = "A library for property based testing"
DESCRIPTION = "Hypothesis is a family of testing libraries which let you write tests parametrized \
by a source of examples. A Hypothesis implementation then generates simple and \
comprehensible examples that make your tests fail. This simplifies writing your \
tests and makes them more powerful at the same time, by letting software automate \
the boring bits and do them to a higher standard than a human would, freeing you \
to focus on the higher level test logic. \
 \
This sort of testing is often called 'property-based testing', and the most widely \
known implementation of the concept is the Haskell library QuickCheck, but \
Hypothesis differs significantly from QuickCheck and is designed to fit idiomatically \
and easily into existing styles of testing that you are used to, with absolutely no \
familiarity with Haskell or functional programming needed."
LICENSE = "MPL-2.0"

PV = "6.75.3"

RPM_NAME = "python310-hypothesis-6.75.3-1.1.noarch.rpm"
RPM_HASH = "c5992e18e883c81f1b26aa61d25c10b4860bb2540db179a0830389a14397fbd1237ff9f4c6098e79c39d9ee2df99c5ad6dd4fbc562b98ba0519228e8c1be76fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis \
python3.10dist-hypothesis \
python310-hypothesis \
python3dist-hypothesis"

RDEPENDS:${PN} += "-python310-exceptiongroup >= 1.0.0 if python310-base < 3.11 \
-python310-sortedcontainers >= 2.1.0 with python310-sortedcontainers < 3.0 \
/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-attrs \
update-alternatives"

inherit rpm
