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

RPM_NAME = "python311-bowler-0.9.0-1.19.noarch.rpm"
RPM_HASH = "9463ba9c07bc5efcf9b9a68168c6b0de5fd1309dd80e744dc1ca071ba21d3189bc94779ea099c93185d3bf49ec206a6589d69c72b5e76eae5f4f04b492f63ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bowler \
python3.11dist-bowler \
python311-bowler \
python3dist-bowler"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-click \
python311-fissix \
python311-moreorless \
python311-setuptools \
python311-volatile \
update-alternatives"

inherit rpm
