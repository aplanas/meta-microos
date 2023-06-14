SUMMARY = "Text Parsing Function Dispatcher"
DESCRIPTION = "TPFD (Text Parsing Function Dispatcher) is an easy way to parse strings and execute \
functions depending on their contents. \
 \
Inspired by Flask and using Parse under the hood, TPFD allows you to decorate functions \
with grammar rules and if a pattern that matches one of your grammar rules is found, \
the function will be run with a set of keyword arguments you've specified passed to it! \
Great for parsing logs and executing macros on what it finds!"
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python39-tpfd-0.2.4-1.14.noarch.rpm"
RPM_HASH = "b52578daa30129225b6d70f2d3fb1d76b43b7eabdc9c9019bb9fb0676acd9cfe82fec8970864b6bed167a9c20e5eb50b0e3bd0a3cc7d6e7c3505c620fe19bd3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tpfd \
python39-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python39-parse"

inherit rpm
