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

PV = "6.82.4"

RPM_NAME = "python310-hypothesis-6.82.4-1.1.noarch.rpm"
RPM_HASH = "66289e8751a774f44aba4f5dcf664ed460a2793492e00efe2e54555954b3427d6aa6277be116c6ed2ccf2f7fd1cfa39ddb5e1a130fe9f321d9745fb04b4c0e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hypothesis \
python310-hypothesis \
python3dist-hypothesis"

RDEPENDS:${PN} += "-python310-sortedcontainers >= 2.1.0 with python310-sortedcontainers < 3.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
update-alternatives"

inherit rpm
