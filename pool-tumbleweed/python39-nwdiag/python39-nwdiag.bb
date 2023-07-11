SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-nwdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "22d40999bae39d507f835eed6969e6ae6b931aab61c98c7eeda6e1f9cb91917d08aba2e3c3aeed10102b0c16d997a103ddc53be5feb3a6c3f7b2a9d369e654ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nwdiag \
python39-nwdiag \
python3dist-nwdiag"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-blockdiag \
python39-setuptools \
update-alternatives"

inherit rpm
