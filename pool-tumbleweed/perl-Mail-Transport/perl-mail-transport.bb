SUMMARY = "Use Mail Transfer Agents (MTAs)"
DESCRIPTION = "Objects which extend 'Mail::Transport' implement sending and/or receiving \
of messages, using various protocols. \
 \
Mail::Transport::Send extends this class, and offers general functionality \
for send protocols, like SMTP. Mail::Transport::Receive also extends this \
class, and offers receive method. Some transport protocols will implement \
both sending and receiving. \
 \
Extends 'DESCRIPTION' in Mail::Reporter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.005"

RPM_NAME = "perl-Mail-Transport-3.005-1.11.noarch.rpm"
RPM_HASH = "f278e42ca7cf92891c52416576b9a820b1e6342e0b959a0c2ec55229aea64f7b0c86ab3fabad5088958bf3a3823555fddf6733247de22bd765a8299c8f78a8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Transport \
perl-Mail--Transport--Exim \
perl-Mail--Transport--Mailx \
perl-Mail--Transport--Qmail \
perl-Mail--Transport--Receive \
perl-Mail--Transport--SMTP \
perl-Mail--Transport--Send \
perl-Mail--Transport--Sendmail \
perl-Mail-Transport"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Mail--Reporter"

inherit rpm
