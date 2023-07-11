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

RPM_NAME = "python39-bowler-0.9.0-1.19.noarch.rpm"
RPM_HASH = "ce9aa921a62920b32ca3268ce7eccbf7fd2c2a145093d540546f36c681b78e22a78522db1364dfc84730815ef89e7f7394b894e68ad864d1e620783ab65aac25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bowler \
python39-bowler \
python3dist-bowler"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-click \
python39-fissix \
python39-moreorless \
python39-setuptools \
python39-volatile \
update-alternatives"

inherit rpm
