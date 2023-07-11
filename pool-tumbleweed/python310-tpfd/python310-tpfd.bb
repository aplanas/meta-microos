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

RPM_NAME = "python310-tpfd-0.2.4-1.16.noarch.rpm"
RPM_HASH = "a9e0e499314dbe495636be87d7cd39a76288615a39c622efe0fdb65e130dc5dc5fa293e1be4723288d6a1f8c884407be04e7dd6f790deba93134d30236b13241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tpfd \
python310-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python310-parse"

inherit rpm
