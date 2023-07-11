SUMMARY = "Python port of libaxolotl-android"
DESCRIPTION = "This is a Python port of libsignal-protocol-java, originally written by Moxie \
Marlinspike."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "python39-axolotl-0.2.3-2.10.noarch.rpm"
RPM_HASH = "fd19ec311f0499086f7dc480c4f4eb165191da2cb97aa46573c6fc1423cef557eabfdf2eb83f5f7d7e55983a8c4fe68725ee188a560ac15b275fd75322856763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-axolotl \
python39-axolotl \
python3dist-python-axolotl"

RDEPENDS:${PN} += "python-abi \
python39-axolotl-curve25519 \
python39-cryptography \
python39-protobuf"

inherit rpm
