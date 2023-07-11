SUMMARY = "Safe code refactoring for modern Python projects"
DESCRIPTION = "Bowler is a refactoring tool for manipulating Python at the syntax tree level. It enables \
safe, large scale code modifications while guaranteeing that the resulting code compiles \
and runs. It provides both a simple command line interface and a fluent API in Python for \
generating complex code modifications in code. \
 \
Bowler uses a 'fluent' `Query` API to build refactoring scripts through a series \
of selectors, filters, and modifiers.  Many simple modifications are already possible \
using the existing API, but you can also provide custom selectors, filters, and \
modifiers as needed to build more complex or custom refactorings.  See the \
[Query Reference](https://pybowler.io/docs/api-query) for more details."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-bowler-0.9.0-1.19.noarch.rpm"
RPM_HASH = "936ef402e02f4e768e866410dbaeac4102fd08cb6fa600fc784e4404978a9f4efa310b112e952a83562c2f7ac49dd6197957f01176a7d15113ffb1bd6d1253e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bowler \
python310-bowler \
python3dist-bowler"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-click \
python310-fissix \
python310-moreorless \
python310-setuptools \
python310-volatile \
update-alternatives"

inherit rpm
