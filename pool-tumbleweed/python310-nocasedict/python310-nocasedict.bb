SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python310-nocasedict-1.0.4-1.5.noarch.rpm"
RPM_HASH = "9ee0b9ffd8bbcf617541d34363fce6a4beb502ec2e6c608ddcd3cbc4c086eb8c300ab85a6975bbbaa1dcf3bea057830dc10ae46e4f2a8850aca9d3997a72ba68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nocasedict \
python310-nocasedict \
python3dist-nocasedict"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
