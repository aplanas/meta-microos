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

PV = "6.82.7"

RPM_NAME = "python39-hypothesis-6.82.7-1.1.noarch.rpm"
RPM_HASH = "22ae49e66408178cf30a1d7e12df202ebeb825eaceb3e3cdd2efeef147a33b6b57deef46c8be4a0b3a71ec76baf9f72cec1deef6ac27fd7d1cf8e1f0f3be3885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hypothesis \
python39-hypothesis \
python3dist-hypothesis"

RDEPENDS:${PN} += "-python39-sortedcontainers >= 2.1.0 with python39-sortedcontainers < 3.0 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
update-alternatives"

inherit rpm
