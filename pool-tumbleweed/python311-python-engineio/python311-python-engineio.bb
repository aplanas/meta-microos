SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.3.4"

RPM_NAME = "python311-python-engineio-4.3.4-2.2.noarch.rpm"
RPM_HASH = "9d72abfadf883e1af8c48d7a416b22d4075ff7c17179a2850201ac77e928bbb36c2c7c5adf89a9f1994acd4deb2447d02194c66ee8c49f45a3e7bf293e8ba5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-engineio) \
python311-python-engineio \
python3dist(python-engineio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
