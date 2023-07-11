SUMMARY = "Fast and Simple Mbox Folder Reader"
DESCRIPTION = "This module implements a fast but simple mbox folder reader. One of three \
implementations (Cache, Grep, Perl) will be used depending on the wishes of \
the user and the system configuration. The first implementation is a \
cached-based one which stores email information about mailboxes on the file \
system. Subsequent accesses will be faster because no analysis of the \
mailbox will be needed. The second implementation is one based on GNU grep, \
and is significantly faster than the Perl version for mailboxes which \
contain very large (10MB) emails. The final implementation is a fast \
Perl-based one which should always be applicable. \
 \
The Cache implementation is about 6 times faster than the standard Perl \
implementation. The Grep implementation is about 4 times faster than the \
standard Perl implementation. If you have GNU grep, it's best to enable \
both the Cache and Grep implementations. If the cache information is \
available, you'll get very fast speeds. Otherwise, you'll take about a 1/3 \
performance hit when the Grep version is used instead. \
 \
The overriding requirement for this module is speed. If you wish more \
sophisticated parsing, use Mail::MboxParser (which is based on this module) \
or Mail::Box."
LICENSE = "GPL-2.0-or-later"

PV = "1.5111"

RPM_NAME = "perl-Mail-Mbox-MessageParser-1.5111-1.17.noarch.rpm"
RPM_HASH = "0d178899363e0d555342a85427db5504d06cb1dfd804076f19c406266ea7344ae9ce43a283b416bdfba727ca2f390532cd52794c006107aefb66424066ff39c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Mbox--MessageParser \
perl-Mail--Mbox--MessageParser--Cache \
perl-Mail--Mbox--MessageParser--Config \
perl-Mail--Mbox--MessageParser--Grep \
perl-Mail--Mbox--MessageParser--MetaInfo \
perl-Mail--Mbox--MessageParser--Perl \
perl-Mail-Mbox-MessageParser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-FileHandle--Unget"

inherit rpm
