SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python39-pyjsparser-2.7.1-2.2.noarch.rpm"
RPM_HASH = "d13548c83378dee31038b7a7ab216d8d1486fb09026e34927962288066ca9d639177a5b7819c647376ace6814bdeb1442a46217e8cdf11ced88cda14395012bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjsparser \
python39-pyjsparser \
python3dist-pyjsparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
