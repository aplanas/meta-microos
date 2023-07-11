SUMMARY = "Object Oriented Authentication-Results Headers"
DESCRIPTION = "Object Oriented Authentication-Results email headers. \
 \
This parser copes with most styles of Authentication-Results header seen in \
the wild, but is not yet fully RFC7601 compliant \
 \
Differences from RFC7601 \
 \
key/value pairs are parsed when present in the authserv-id section, this is \
against RFC but has been seen in headers added by Yahoo!. \
 \
Comments added between key/value pairs will be added after them in the data \
structures and when stringified."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.20230112"

RPM_NAME = "perl-Mail-AuthenticationResults-2.20230112-1.2.noarch.rpm"
RPM_HASH = "a273e2a78d9079af2dff51147c0bc085bc9100f22964ad6a722d3e67344a5e84c748b73d05312b068289beb174ac55137679be675dee72d08c2ed4bef6956252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--AuthenticationResults \
perl-Mail--AuthenticationResults--FoldableHeader \
perl-Mail--AuthenticationResults--Header \
perl-Mail--AuthenticationResults--Header--AuthServID \
perl-Mail--AuthenticationResults--Header--Base \
perl-Mail--AuthenticationResults--Header--Comment \
perl-Mail--AuthenticationResults--Header--Entry \
perl-Mail--AuthenticationResults--Header--Group \
perl-Mail--AuthenticationResults--Header--SubEntry \
perl-Mail--AuthenticationResults--Header--Version \
perl-Mail--AuthenticationResults--Parser \
perl-Mail--AuthenticationResults--Token \
perl-Mail--AuthenticationResults--Token--Assignment \
perl-Mail--AuthenticationResults--Token--Comment \
perl-Mail--AuthenticationResults--Token--QuotedString \
perl-Mail--AuthenticationResults--Token--Separator \
perl-Mail--AuthenticationResults--Token--Space \
perl-Mail--AuthenticationResults--Token--String \
perl-Mail-AuthenticationResults"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Clone \
perl-JSON"

inherit rpm
