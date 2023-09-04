SUMMARY = "Library for sending email"
DESCRIPTION = "Email::Sender replaces the old and sometimes problematic Email::Send \
library, which did a decent job at handling very simple email sending \
tasks, but was not suitable for serious use, for a variety of reasons. \
 \
Most users will be able to use Email::Sender::Simple to send mail. Users \
with more specific needs should look at the available \
Email::Sender::Transport classes. \
 \
Documentation may be found in Email::Sender::Manual, and new users should \
start with Email::Sender::Manual::QuickStart."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.600"

RPM_NAME = "perl-Email-Sender-2.600-1.4.noarch.rpm"
RPM_HASH = "7d1f85952032e84b16b7214cdda1018ac6efcdf68db6d6d2476fbc2fbd2dcd824a990dae31e23dd95c0aab98a5658bdd945e7a0b87cf5add704f9698526de2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Sender \
perl-Email--Sender--Failure \
perl-Email--Sender--Failure--Multi \
perl-Email--Sender--Failure--Permanent \
perl-Email--Sender--Failure--Temporary \
perl-Email--Sender--Manual \
perl-Email--Sender--Manual--QuickStart \
perl-Email--Sender--Role--CommonSending \
perl-Email--Sender--Role--HasMessage \
perl-Email--Sender--Simple \
perl-Email--Sender--Success \
perl-Email--Sender--Success--Partial \
perl-Email--Sender--Transport \
perl-Email--Sender--Transport--DevNull \
perl-Email--Sender--Transport--Failable \
perl-Email--Sender--Transport--Maildir \
perl-Email--Sender--Transport--Mbox \
perl-Email--Sender--Transport--Print \
perl-Email--Sender--Transport--SMTP \
perl-Email--Sender--Transport--SMTP--Persistent \
perl-Email--Sender--Transport--Sendmail \
perl-Email--Sender--Transport--Test \
perl-Email--Sender--Transport--Wrapper \
perl-Email--Sender--Util \
perl-Email-Sender"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Email--Abstract \
perl-Email--Address--XS \
perl-Email--Simple \
perl-File--Path \
perl-List--Util \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-MooX--Types--MooseLike \
perl-MooX--Types--MooseLike--Base \
perl-Net--SMTP \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Throwable--Error \
perl-Try--Tiny"

inherit rpm
