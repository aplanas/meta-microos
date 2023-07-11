SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-certipy-0.1.3-2.13.noarch.rpm"
RPM_HASH = "444d86273a49ae9c39b81929cacb766cb2105fa9a05f949f7f71e3e3b84068789c317e670d64e0419ca211beac448f2a5faa1b78cd1fb59575a87b59a7adcad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certipy \
python3.11dist-certipy \
python311-certipy \
python3dist-certipy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyOpenSSL \
update-alternatives"

inherit rpm
