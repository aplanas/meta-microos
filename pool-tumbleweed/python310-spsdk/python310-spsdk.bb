SUMMARY = "Unified, reliable and easy to use SW library working across NXP MCU portfolio"
DESCRIPTION = "Secure Provisioning SDK (SPSDK) is unified, reliable and easy to use SW library working across NXP MCU portfolio providing strong foundation from quick customer prototyping up to production deployment."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python310-spsdk-1.10.0-1.1.noarch.rpm"
RPM_HASH = "8b388f97fe48d59ff52633f341058ea940e4f64b12829fcc1e7b22e8fb0f586905fef1af7013a68c92c47e3bc56a5ed55563b85959a0fcb191ea4e9f1e9b4c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spsdk \
python310-spsdk \
python3dist-spsdk"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-asn1crypto \
python310-astunparse \
python310-bincopy \
python310-bitstring \
python310-click \
python310-click-command-tree \
python310-click-option-group \
python310-colorama \
python310-commentjson \
python310-crcmod \
python310-cryptography \
python310-deepmerge \
python310-fastjsonschema \
python310-hexdump \
python310-jinja2 \
python310-libusbsio \
python310-oscrypto \
python310-pycryptodome \
python310-pylink-square \
python310-pyocd \
python310-pyserial \
python310-ruamel.yaml \
python310-sly \
python310-typing-extensions \
update-alternatives"

inherit rpm
