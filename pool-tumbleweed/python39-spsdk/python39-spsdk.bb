SUMMARY = "Unified, reliable and easy to use SW library working across NXP MCU portfolio"
DESCRIPTION = "Secure Provisioning SDK (SPSDK) is unified, reliable and easy to use SW library working across NXP MCU portfolio providing strong foundation from quick customer prototyping up to production deployment."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python39-spsdk-1.10.0-1.1.noarch.rpm"
RPM_HASH = "1a3629f7f32a31efb84248ddd3b4d45d9bf1078a0d04475e5ca6ca2427e290aa75a8598f11d4e4faa3d845f1562024607c139f9c422c8755c30c58bf44caad9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spsdk \
python39-spsdk \
python3dist-spsdk"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-asn1crypto \
python39-astunparse \
python39-bincopy \
python39-bitstring \
python39-click \
python39-click-command-tree \
python39-click-option-group \
python39-colorama \
python39-commentjson \
python39-crcmod \
python39-cryptography \
python39-deepmerge \
python39-fastjsonschema \
python39-hexdump \
python39-jinja2 \
python39-libusbsio \
python39-oscrypto \
python39-pycryptodome \
python39-pylink-square \
python39-pyocd \
python39-pyserial \
python39-ruamel.yaml \
python39-sly \
python39-typing-extensions \
update-alternatives"

inherit rpm
