SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.15"

RPM_NAME = "python39-translation-finder-2.15-1.2.noarch.rpm"
RPM_HASH = "41683fb00e1f5763fb05e0d81cf0bf67cfd5a42db08bc9384aa702a2e488e82723bfd170e9db255481a0649529a06a63529293bcd9f192588270ce33121f4ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-translation-finder \
python39-translation-finder \
python3dist-translation-finder"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-ruamel.yaml \
python39-setuptools \
python39-weblate-language-data \
update-alternatives"

inherit rpm
