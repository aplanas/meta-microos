SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.15"

RPM_NAME = "python311-translation-finder-2.15-1.4.noarch.rpm"
RPM_HASH = "103b02d3c477bde80440f919255ce24ef514883ad6b9aa606713c75ce291a97bcda70b487fceb3d7366f6a191d2ad8d1bb24a81d7dec25496ba622b770272042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translation-finder \
python3.11dist-translation-finder \
python311-translation-finder \
python3dist-translation-finder"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ruamel.yaml \
python311-setuptools \
python311-weblate-language-data \
update-alternatives"

inherit rpm
