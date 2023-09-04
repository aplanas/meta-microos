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

RPM_NAME = "perl-Net-Whois-Raw-2.99037-1.4.noarch.rpm"
RPM_HASH = "c922f829a1449522ce80add0a6487da3da3c328a17356c48af34636a3e224b15b838ca987d7ba537ef0680d08ff1228ad423ff76b154ce0aade14c528f0c8a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Whois--Raw \
perl-Net--Whois--Raw--Common \
perl-Net--Whois--Raw--Data \
perl-Net-Whois-Raw"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-IO--Socket--IP \
perl-LWP--UserAgent \
perl-Net--IDN--Punycode \
perl-Regexp--IPv6 \
perl-URI--URL"

inherit rpm
