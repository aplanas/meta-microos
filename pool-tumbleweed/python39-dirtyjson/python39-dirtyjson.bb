SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python39-dirtyjson-1.0.8-1.5.noarch.rpm"
RPM_HASH = "029c6816d38dcc61d133dd4dd2cef074954055e7ed4a848fd6c66ad72efe46c3c3a8951758faaf877153ee3cf4e52e4367bc79c43fc8b9e5a53d500fe1267fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dirtyjson \
python39-dirtyjson \
python3dist-dirtyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
