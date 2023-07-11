SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python311-agate-sql-0.5.9-2.3.noarch.rpm"
RPM_HASH = "94be803ea3f0b2e84cdc39babdec909d383f9e9291037608209e93a61dc201e5721dca8a4408d9f4bb2e139556b6f36ae033f4347f2de763430a982c08dc77b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-sql \
python3.11dist-agate-sql \
python311-agate-sql \
python3dist-agate-sql"

RDEPENDS:${PN} += "-python311-sqlalchemy >= 1.0.8 with python311-sqlalchemy < 2 \
python-abi \
python311-agate"

inherit rpm
