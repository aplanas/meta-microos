SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "python311-cached-property-1.5.2-4.1.noarch.rpm"
RPM_HASH = "bb93ea6403acec0a88ec14916c88d95657a7bfd0b59a152d8268019fa96e8c3cf63c40e47ab87dc09458b46191320f599c62896b5750adb82636d8b432b7c624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cached-property) \
python311-cached-property \
python3dist(cached-property)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
