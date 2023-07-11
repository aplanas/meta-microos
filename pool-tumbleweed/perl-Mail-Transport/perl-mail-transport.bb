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

RPM_NAME = "perl-Mail-Transport-3.005-1.12.noarch.rpm"
RPM_HASH = "63139037aacde56bc71e2ca2f9d80ee3d54ac305d4257815cdbdbb72c04045aa2036b1d51c495fdacddf489fcae2b9edbf4ec27d21ac27cbbf34786f762ee187"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mail--Reporter"

inherit rpm
