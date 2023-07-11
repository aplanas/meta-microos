SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.2.3"

RPM_NAME = "python310-hypothesmith-0.2.3-2.3.noarch.rpm"
RPM_HASH = "823ce50334a6dc71e40092a5cdca72c3f296d983d4a6d6b1fe34f9df37c5d60708069b4049f9f93cadc928e5dad4ac01488e1127bae012c4cbdd0e2339ca5ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hypothesmith \
python310-hypothesmith \
python3dist-hypothesmith"

RDEPENDS:${PN} += "python-abi \
python310-base \
python310-hypothesis \
python310-lark \
python310-libcst"

inherit rpm
