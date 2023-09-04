SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.7"

RPM_NAME = "python39-distlib-0.3.7-1.1.noarch.rpm"
RPM_HASH = "5b18286abf59d517ec0c469cf9633ad824bfda8152ee8871d077add6f223a3052a8f2d55574ac2654ae2cc377e5b5eca55bb4954e622b54c0f70124127a16ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distlib \
python39-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
