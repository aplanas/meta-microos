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

RPM_NAME = "python310-bowler-0.9.0-1.17.noarch.rpm"
RPM_HASH = "327dbe8ab4c5a07868f5c9e0ba686dabae2a5c75a4e266af2434c5e9bd29cd1bfd14a2252a0c0964d4556e576b6f59e61f6de354830ecbb56e93684956ac14f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bowler \
python3.10dist-bowler \
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
