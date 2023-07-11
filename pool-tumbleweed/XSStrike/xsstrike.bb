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

RPM_NAME = "XSStrike-3.1.5-1.7.noarch.rpm"
RPM_HASH = "7bbe47627b2a68de994b0bf4220448b675cd2efbfabae68b6c8ce53381c85cec4528d65b0ae1483a8eb202c42ec3c6e813561b78e33dfb5a7204ef1cb9f0a554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "XSStrike"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-fuzzywuzzy"

inherit rpm
