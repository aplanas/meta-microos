SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-ufonormalizer-0.6.1-1.9.noarch.rpm"
RPM_HASH = "746314dbe8a57d76efa8908808da345984c156def5c10b399d94ebc5126a6ac64a976692102e852285dc3529ae01565de03fa0693275333fe4055028e11f8aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufonormalizer \
python3.11dist-ufonormalizer \
python311-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
