SUMMARY = "Unified interface to mail representations"
DESCRIPTION = "'Email::Abstract' provides module writers with the ability to write simple, \
representation-independent mail handling code. For instance, in the cases \
of 'Mail::Thread' or 'Mail::ListDetector', a key part of the code involves \
reading the headers from a mail object. Where previously one would either \
have to specify the mail class required, or to build a new object from \
scratch, 'Email::Abstract' can be used to perform certain simple operations \
on an object regardless of its underlying representation. \
 \
'Email::Abstract' currently supports 'Mail::Internet', 'MIME::Entity', \
'Mail::Message', 'Email::Simple', 'Email::MIME', and 'Courriel'. Other \
representations are encouraged to create their own 'Email::Abstract::*' \
class by copying 'Email::Abstract::EmailSimple'. All modules installed \
under the 'Email::Abstract' hierarchy will be automatically picked up and \
used."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.009"

RPM_NAME = "perl-Email-Abstract-3.009-1.10.noarch.rpm"
RPM_HASH = "ade1e759178cffc1e6214f6e6cebb8d7fdfb4c7abbca3086b50cf65b21de9bf3286ed83af58a25c8207f7cd37e2be44e54204f231543cd85713203f5ef715875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Abstract \
perl-Email--Abstract--EmailMIME \
perl-Email--Abstract--EmailSimple \
perl-Email--Abstract--MIMEEntity \
perl-Email--Abstract--MailInternet \
perl-Email--Abstract--MailMessage \
perl-Email--Abstract--Plugin \
perl-Email-Abstract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Email--Simple \
perl-MRO--Compat \
perl-Module--Pluggable"

inherit rpm
