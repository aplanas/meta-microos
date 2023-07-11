SUMMARY = "Command Line Interface to manage Microsoft Azure services"
DESCRIPTION = "Management tool for the Microsoft Azure public cloud service. \
It allows uploading, registering and maintaining OS images for \
multiple Azure Account Subscriptions."
LICENSE = "Apache-2.0"

PV = "3.0.4"

RPM_NAME = "python3-azurectl-3.0.4-1.16.noarch.rpm"
RPM_HASH = "e7be2fc01aaef9aaeded4f10ed5a489c779e9ff53626213e09f53cc610df8366c16cc01ef6d24fe51bffd8979ac7109c8c8682513a40710e3e3b4fbf955d62ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-azurectl \
python-azurectl \
python3-azurectl \
python3.11dist-azurectl \
python3dist-azurectl"

RDEPENDS:${PN} += "/usr/bin/python3 \
man \
openssl \
python-abi \
python3-APScheduler \
python3-azure-servicemanagement-legacy \
python3-azure-storage \
python3-cryptography \
python3-docopt \
python3-pyOpenSSL \
python3-python-dateutil \
python3-setuptools"

inherit rpm
