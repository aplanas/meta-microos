SUMMARY = "Parse and format RFC 5322 email addresses and groups"
DESCRIPTION = "This module implements at https://tools.ietf.org/html/rfc5322 parser and \
formatter of email addresses and groups. It parses an input string from \
email headers which contain a list of email addresses or a groups of email \
addresses (like From, To, Cc, Bcc, Reply-To, Sender, ...). Also it can \
generate a string value for those headers from a list of email addresses \
objects. Module is backward compatible with at \
https://tools.ietf.org/html/rfc2822 and at \
https://tools.ietf.org/html/rfc822. \
 \
Parser and formatter functionality is implemented in XS and uses shared \
code from Dovecot IMAP server. \
 \
It is a drop-in replacement for the Email::Address module which has several \
security issues. E.g. issue at \
https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2015-7686, which allows \
remote attackers to cause denial of service, is still present in \
Email::Address version 1.908. \
 \
Email::Address::XS module was created to finally fix CVE-2015-7686. \
 \
Existing applications that use Email::Address module could be easily \
switched to Email::Address::XS module. In most cases only changing 'use \
Email::Address' to 'use Email::Address::XS' and replacing every \
'Email::Address' occurrence with 'Email::Address::XS' is sufficient. \
 \
So unlike Email::Address, this module does not use regular expressions for \
parsing but instead native XS implementation parses input string \
sequentially according to RFC 5322 grammar. \
 \
Additionally it has support also for named groups and so can be use instead \
of the Email::Address::List module. \
 \
If you are looking for the module which provides object representation for \
the list of email addresses suitable for the MIME email headers, see \
Email::MIME::Header::AddressList."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.05"

RPM_NAME = "perl-Email-Address-XS-1.05-1.5.aarch64.rpm"
RPM_HASH = "cc658744e671fc59cd67c5917e49147bde1ec2637af508c2089eb23a59274fe23bf31190beecfe557cc623af5c6ffafab125f622f8fc0a1f865055c5924eb400"

RPROVIDES:${PN} += "perl-Email--Address--XS \
perl-Email-Address-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
