SUMMARY = "Operations with ISO 8601 durations"
DESCRIPTION = "ISO 8601 is most commonly known as a way to exchange datetimes in textual format. \
A lesser known aspect of the standard is the representation of durations. They \
have a shape similar to this: \
 \
    P3Y6M4DT12H30M5S \
 \
This string represents a duration of 3 years, 6 months, 4 days, 12 hours, \
30 minutes, and 5 seconds. \
 \
The state of the art of ISO 8601 duration handling in Python is more or less \
limited to what's offered by isodate. What we are trying to achieve here is to \
address the shortcomings of isodate (as described in their own Limitations section), \
and a few of our own annoyances with their interface, such as the lack of uniformity \
in their handling of types, and the use of regular expressions for parsing."
LICENSE = "ISC"

PV = "20.11.0"

RPM_NAME = "python310-isoduration-20.11.0-2.3.noarch.rpm"
RPM_HASH = "04edb4f52b3676bfc331cd1e74427e6fbc14b17dbcb273401e565eaa73e85a79281c09e32699ae058934b138b1aca986ca87a38386fcc886b0d0fd6a608b6ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isoduration \
python310-isoduration \
python3dist-isoduration"

RDEPENDS:${PN} += "python-abi \
python310-arrow"

inherit rpm
