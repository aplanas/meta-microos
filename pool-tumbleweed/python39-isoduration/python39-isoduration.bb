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

RPM_NAME = "python39-isoduration-20.11.0-2.1.noarch.rpm"
RPM_HASH = "bc148cb36c37d476940846f1b442871bcd4b03257405f7d2e8650836911688d717ca438159080dd31894d549bbdda0a9f35462ce14cda7faa482193563cb5e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isoduration \
python39-isoduration \
python3dist-isoduration"

RDEPENDS:${PN} += "python-abi \
python39-arrow"

inherit rpm
