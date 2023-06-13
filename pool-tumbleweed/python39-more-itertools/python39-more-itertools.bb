SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python39-more-itertools-9.1.0-2.1.noarch.rpm"
RPM_HASH = "991107e8fdd76254aa1b8d1170c89e2f7b7b36f4a21d474d3a87499ccdf165d1b625b199434d332f31835da3502e040570520657f34e82e0bcf5b891e8a23d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(more-itertools) \
python39-more-itertools \
python3dist(more-itertools)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
