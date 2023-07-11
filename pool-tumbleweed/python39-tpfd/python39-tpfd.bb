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

RPM_NAME = "python39-tpfd-0.2.4-1.16.noarch.rpm"
RPM_HASH = "91af81f9d75202b9314fa755f0b76358b2a873fc9c4c0e637df3cd4922d51675e3de1a1cbd356c7ac6c599a5472f33ccf595acdd241f4a8121a962edbf4091f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tpfd \
python39-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python39-parse"

inherit rpm
