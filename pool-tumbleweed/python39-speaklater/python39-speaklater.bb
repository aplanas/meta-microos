SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python39-speaklater-1.3-2.15.noarch.rpm"
RPM_HASH = "8e99838146354e5e81b8e9d5aff81ba2a2e30e95985dc61115ad98f5f3c29fadb50adb9c7d432da912a3680173f0b8f6129b72babc73463a70b7076bd3ec9692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(speaklater) \
python39-speaklater \
python3dist(speaklater)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
