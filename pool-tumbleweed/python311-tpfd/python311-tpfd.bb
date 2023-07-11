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

RPM_NAME = "python311-tpfd-0.2.4-1.16.noarch.rpm"
RPM_HASH = "e5681199772673d063350a0af0a0b704262ac3070ee908d14c378b381b1d1e5da8e90d7aa6d50b4967dd47d50aaa81ee1eeb7db1d5be77649a7f59e6c5a2b30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tpfd \
python3.11dist-tpfd \
python311-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python311-parse"

inherit rpm
