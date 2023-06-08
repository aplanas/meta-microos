SUMMARY = "Most advanced XSS scanner"
DESCRIPTION = " \
XSStrike is a Cross Site Scripting detection suite equipped with four hand \
written parsers, an intelligent payload generator, a powerful fuzzing engine \
and an incredibly fast crawler. \
 \
Instead of injecting payloads and checking it works like all the other tools \
do, XSStrike analyses the response with multiple parsers and then crafts \
payloads that are guaranteed to work by context analysis integrated with a \
fuzzing engine."
LICENSE = "GPL-3.0-only"

PV = "3.1.5"

RPM_NAME = "XSStrike-3.1.5-1.6.noarch.rpm"
RPM_HASH = "674ce2028e0588fbd6564d53b61d67f4193423acc8caaac57857be773204ddcf78135857320e7c7939b8c942f078414f6a163c0895d63f69c74d0c795fca359b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "XSStrike"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python3-fuzzywuzzy"

inherit rpm
