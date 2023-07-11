SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python311-pyjsparser-2.7.1-2.2.noarch.rpm"
RPM_HASH = "8256efadd314ec12f2b1ba23de48f0df65ac71d4c8e20ebfcfc2b12e55c9c3c2b6588ea7c90cbd30e2ca6c458861e2188dc66a085de58cdb4cd7f0ba8324ddbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjsparser \
python3.11dist-pyjsparser \
python311-pyjsparser \
python3dist-pyjsparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
