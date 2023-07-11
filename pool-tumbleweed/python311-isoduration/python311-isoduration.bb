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

RPM_NAME = "python311-isoduration-20.11.0-2.3.noarch.rpm"
RPM_HASH = "b7be6b1143419c4ae0e0a007dffeae177a56be26614a9e9f52f57a63d7ebae7da6844e56d099c2ade67f138c08d98abbe1bffd54ae5977971190363099b63c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isoduration \
python3.11dist-isoduration \
python311-isoduration \
python3dist-isoduration"

RDEPENDS:${PN} += "python-abi \
python311-arrow"

inherit rpm
