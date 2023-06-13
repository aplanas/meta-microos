SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python310-speaklater-1.3-2.15.noarch.rpm"
RPM_HASH = "49724c5903835d8922d3af76cd409eb9fcdcb35f7803ef777f83c3e4cf717bd53d75f9f6f12ef76531a9cfef9567317b880f124ef29ef38c5e4e25e97f290019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-speaklater \
python3.10dist(speaklater) \
python310-speaklater \
python3dist(speaklater)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
