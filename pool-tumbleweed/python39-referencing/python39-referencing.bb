SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.0"

RPM_NAME = "python39-referencing-0.29.0-1.3.noarch.rpm"
RPM_HASH = "9ed6cbceb31725fce3ef1cf8e114a887854377693f8df9c7a9e41da00ebbe806c945e6393b39b7e213f0ca9bba548bf1b2b5971e8dbc47afc9c7cb16aa16fc10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-referencing \
python39-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-rpds-py"

inherit rpm
