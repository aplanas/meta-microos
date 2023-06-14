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

RPM_NAME = "python310-tpfd-0.2.4-1.14.noarch.rpm"
RPM_HASH = "11e78dd22b428b776b896fa6ac7ea7304bdbb4476e4fa4a68f1f1cbc08b27bed417ebfeee55ed618a3821f1f15693d769bc8b9f7a0b67d3b7d468a596d707c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tpfd \
python3.10dist-tpfd \
python310-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python310-parse"

inherit rpm
