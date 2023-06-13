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

RPM_NAME = "python311-tpfd-0.2.4-1.14.noarch.rpm"
RPM_HASH = "e7a75efcd4e614ecafc850f602f93fc13964d2eb08e75c31e840c0d50de7a830c7b3938b75df3f83814a02f58d24dc34ad834c5a650ff1f4ee81c308f81cd6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tpfd) \
python311-tpfd \
python3dist(tpfd)"

RDEPENDS:${PN} += "python(abi) \
python311-parse"

inherit rpm
