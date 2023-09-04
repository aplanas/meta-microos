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

RPM_NAME = "perl-Mail-Transport-3.005-1.13.noarch.rpm"
RPM_HASH = "40058fb6e0bc07292ecac521600afc3fd0f941971c141a5e2585e5367545b7b1fec794a8a2b1fbbe53ff3386838727b66284d57f6f492f657954a920a9973a7e"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mail--Reporter"

inherit rpm
