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

RPM_NAME = "python311-hypothesis-6.75.3-1.3.noarch.rpm"
RPM_HASH = "4c1431aaa5059a8c9a77767387383989b5d730a3d046d05a0dc6abfebab0ea6d9e4a3e157095953d1880caaa23aa92567665c76d554a7cbb3b60d18d69514614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis \
python3.11dist-hypothesis \
python311-hypothesis \
python3dist-hypothesis"

RDEPENDS:${PN} += "-python311-sortedcontainers >= 2.1.0 with python311-sortedcontainers < 3.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
update-alternatives"

inherit rpm
