SUMMARY = "Unified, reliable and easy to use SW library working across NXP MCU portfolio"
DESCRIPTION = "Secure Provisioning SDK (SPSDK) is unified, reliable and easy to use SW library working across NXP MCU portfolio providing strong foundation from quick customer prototyping up to production deployment."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python311-spsdk-1.10.0-1.1.noarch.rpm"
RPM_HASH = "4ee3bea079246a9d7df0378d17d05ed77bd4124f8087837bd9a8b2f43e6129cb2d4abf7fdd53dcd07e2a63a3e7bfe8bee622373ce27107d3f419f4e46f71359b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spsdk \
python3.11dist-spsdk \
python311-spsdk \
python3dist-spsdk"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-asn1crypto \
python311-astunparse \
python311-bincopy \
python311-bitstring \
python311-click \
python311-click-command-tree \
python311-click-option-group \
python311-colorama \
python311-commentjson \
python311-crcmod \
python311-cryptography \
python311-deepmerge \
python311-fastjsonschema \
python311-hexdump \
python311-jinja2 \
python311-libusbsio \
python311-oscrypto \
python311-pycryptodome \
python311-pylink-square \
python311-pyocd \
python311-pyserial \
python311-ruamel.yaml \
python311-sly \
python311-typing-extensions \
update-alternatives"

inherit rpm
