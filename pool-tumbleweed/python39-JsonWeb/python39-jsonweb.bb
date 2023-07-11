SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python39-JsonWeb-0.8.2-6.3.noarch.rpm"
RPM_HASH = "06b7b6e52f4913626b0bb3a38ee4f2099d1ce816c6aaf76a9157992991ca7fd475cfb1d9ecb09c52f10408c957440c2ba299608779cafe832c6828e22eabae2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonweb \
python39-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
