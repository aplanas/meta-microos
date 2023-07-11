SUMMARY = "Get Whois information of domains and IP addresses"
DESCRIPTION = "Net::Whois::Raw queries WHOIS servers about domains. The module supports \
recursive WHOIS queries. Also queries via HTTP is supported for some TLDs. \
 \
Setting the variables $OMIT_MSG and $CHECK_FAIL will match the results \
against a set of known patterns. The first flag will try to omit the \
copyright message/disclaimer, the second will attempt to determine if the \
search failed and return undef in such a case. \
 \
*IMPORTANT*: these checks merely use pattern matching; they will work on \
several servers but certainly not on all of them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.99037"

RPM_NAME = "perl-Net-Whois-Raw-2.99037-1.3.noarch.rpm"
RPM_HASH = "f98173c7a112ca551a8259132e91fa300d7eda4e614298fa95c28144796240ace0996b51e4ebe8b79467f66ef1c111ad319612835550426fcbddd2f2be0893cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Whois--Raw \
perl-Net--Whois--Raw--Common \
perl-Net--Whois--Raw--Data \
perl-Net-Whois-Raw"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-IO--Socket--IP \
perl-LWP--UserAgent \
perl-Net--IDN--Punycode \
perl-Regexp--IPv6 \
perl-URI--URL"

inherit rpm
