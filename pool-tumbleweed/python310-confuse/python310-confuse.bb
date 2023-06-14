SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-confuse-2.0.1-1.1.noarch.rpm"
RPM_HASH = "f50067b394de9d6aece2a35542db225eb06b6aa405fd22aa5bc1490b95a952bcfee1211bf29666742a62eebde60a5e2b36d0ab921f58e04f0f09144b5f9ef21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confuse \
python3.10dist-confuse \
python310-confuse \
python3dist-confuse"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
