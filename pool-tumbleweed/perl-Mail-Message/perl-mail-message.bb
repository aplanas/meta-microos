SUMMARY = "Processing MIME messages"
DESCRIPTION = "A 'Mail::Message' object is a container for MIME-encoded message \
information, as defined by RFC2822. Everything what is not specificaly \
related to storing the messages in mailboxes (folders) is implemented in \
this class. Methods which are related to folders is implemented in the \
Mail::Box::Message extension."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.013"

RPM_NAME = "perl-Mail-Message-3.013-1.2.noarch.rpm"
RPM_HASH = "2cb55f33233fe0eaf3b625d58286dd09f467bfd9efb7511a522f9b3f9bb804bac6459d383085d65de07575791904e17a6bd951ec1dbcf4c1d675949fcbcf149f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Box--FastScalar \
perl-Mail--Box--Parser \
perl-Mail--Box--Parser--Perl \
perl-Mail--Message \
perl-Mail--Message--Body \
perl-Mail--Message--Body--File \
perl-Mail--Message--Body--Lines \
perl-Mail--Message--Body--Multipart \
perl-Mail--Message--Body--Nested \
perl-Mail--Message--Body--String \
perl-Mail--Message--Convert \
perl-Mail--Message--Convert--EmailSimple \
perl-Mail--Message--Convert--Html \
perl-Mail--Message--Convert--HtmlFormatPS \
perl-Mail--Message--Convert--HtmlFormatText \
perl-Mail--Message--Convert--MailInternet \
perl-Mail--Message--Convert--MimeEntity \
perl-Mail--Message--Convert--TextAutoformat \
perl-Mail--Message--Field \
perl-Mail--Message--Field--AddrGroup \
perl-Mail--Message--Field--Address \
perl-Mail--Message--Field--Addresses \
perl-Mail--Message--Field--Attribute \
perl-Mail--Message--Field--AuthResults \
perl-Mail--Message--Field--DKIM \
perl-Mail--Message--Field--Date \
perl-Mail--Message--Field--Fast \
perl-Mail--Message--Field--Flex \
perl-Mail--Message--Field--Full \
perl-Mail--Message--Field--Structured \
perl-Mail--Message--Field--URIs \
perl-Mail--Message--Field--Unstructured \
perl-Mail--Message--Head \
perl-Mail--Message--Head--Complete \
perl-Mail--Message--Head--FieldGroup \
perl-Mail--Message--Head--ListGroup \
perl-Mail--Message--Head--Partial \
perl-Mail--Message--Head--ResentGroup \
perl-Mail--Message--Head--SpamGroup \
perl-Mail--Message--Part \
perl-Mail--Message--Replace--MailHeader \
perl-Mail--Message--Replace--MailInternet \
perl-Mail--Message--Test \
perl-Mail--Message--TransferEnc \
perl-Mail--Message--TransferEnc--Base64 \
perl-Mail--Message--TransferEnc--Binary \
perl-Mail--Message--TransferEnc--EightBit \
perl-Mail--Message--TransferEnc--QuotedPrint \
perl-Mail--Message--TransferEnc--SevenBit \
perl-Mail--Reporter \
perl-Mail-Message"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Format \
perl-Date--Parse \
perl-Encode \
perl-IO--Scalar \
perl-MIME--Types \
perl-Mail--Address \
perl-Time--Zone \
perl-URI \
perl-User--Identity"

inherit rpm
