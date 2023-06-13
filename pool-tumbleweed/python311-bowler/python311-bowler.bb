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

RPM_NAME = "python311-bowler-0.9.0-1.17.noarch.rpm"
RPM_HASH = "c938a4191389fc24603be268fe076355fa061f680008f937a6d3a5d2ad4fef69c6eed492020f33e3f6b804ff43ce95727a488fbde367bfda5455b698e34a53b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bowler) \
python311-bowler \
python3dist(bowler)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-attrs \
python311-click \
python311-fissix \
python311-moreorless \
python311-setuptools \
python311-volatile \
update-alternatives"

inherit rpm
