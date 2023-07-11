SUMMARY = "General message object"
DESCRIPTION = "A 'Mail::Message' object is a container for MIME-encoded message \
information, as defined by RFC2822. Everything what is not specificaly \
related to storing the messages in mailboxes (folders) is implemented in \
this class. Methods which are related to folders is implemented in the \
Mail::Box::Message extension."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.012"

RPM_NAME = "perl-Mail-Message-3.012-1.8.noarch.rpm"
RPM_HASH = "5b792f8bd954fcf29b73cf50eb90c1f7f99c1544dd2b212d8619f4fb15e4acac9588d161704276cc63fa4524aec0b0bd189354187d45bb2b9058e33079784869"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
