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

RPM_NAME = "perl-Email-Abstract-3.009-1.11.noarch.rpm"
RPM_HASH = "f8a7d74d159daec084fdc6b4bfcf77c48d8c2d2f469858fd86f9665e40da7fdbf9397f10cfdb170bf96903c63e2fe9122d9b7a72538fc3cbc2a314a7950bed4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Abstract \
perl-Email--Abstract--EmailMIME \
perl-Email--Abstract--EmailSimple \
perl-Email--Abstract--MIMEEntity \
perl-Email--Abstract--MailInternet \
perl-Email--Abstract--MailMessage \
perl-Email--Abstract--Plugin \
perl-Email-Abstract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Email--Simple \
perl-MRO--Compat \
perl-Module--Pluggable"

inherit rpm
