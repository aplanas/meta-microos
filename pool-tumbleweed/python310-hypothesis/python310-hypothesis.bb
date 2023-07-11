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

RPM_NAME = "python310-hypothesis-6.75.3-1.3.noarch.rpm"
RPM_HASH = "768570a0ee95164f1bcb68b2d54e08b4d77239ae2d69f922f5600db7e1dd9818d97fcad20640379b0992de3bec0930995522fb71f8cf76cfd9b47a324436ef89"
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
