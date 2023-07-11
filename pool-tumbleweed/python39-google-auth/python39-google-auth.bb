SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "python39-google-auth-2.21.0-1.1.noarch.rpm"
RPM_HASH = "c15068e92cb9081e58f4752f00dadd8123379ed4d55cc71c1486728b97a2f54d5648bfceedc95bc97d0bc7c47b3f63a216b417fd1321ef99a195595d69739988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-auth \
python39-google-auth \
python3dist-google-auth"

RDEPENDS:${PN} += "python-abi \
python39-cachetools \
python39-cryptography \
python39-pyasn1-modules \
python39-rsa \
python39-setuptools \
python39-six"

inherit rpm
