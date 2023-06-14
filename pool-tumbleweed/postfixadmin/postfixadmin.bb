SUMMARY = "Web-based management tool for Postfix virtual domains, mailboxes and aliases"
DESCRIPTION = "PostfixAdmin is a PHP based application that handles Postfix Style Virtual Domains and \
Users that are stored in MySQL or PostgreSQL. \
 \
Postfix Admin supports: \
- Virtual Mailboxes / Virtual Aliases / Forwarders \
- Alias domains (Domain to Domain forwarding with recipient validation) \
- Vacation (auto-response) for Virtual Mailboxes. \
- Quota / Alias & Mailbox limits per domain. \
- Fetchmail integration \
- Packaged with over 25 languages."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.13"

RPM_NAME = "postfixadmin-3.3.13-1.2.noarch.rpm"
RPM_HASH = "c2884ef3f74ee28376f6feca72a84935b67df925bfa46cd756aa22497bdba48632cb4535fab3f1f0ec7fe765af5752042816c807b5d073dd67caacf0e708cc5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postfixadmin \
postfixadmin"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/perl \
/usr/sbin/sendmail \
perl-DBI \
perl-Email--Sender--Simple \
perl-Email--Sender--Transport--SMTP \
perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Valid \
perl-Encode \
perl-Fcntl \
perl-File--Basename \
perl-File--Path \
perl-File--Temp \
perl-Getopt--Long \
perl-Getopt--Std \
perl-IO \
perl-IO--File \
perl-LockFile--Simple \
perl-Log--Log4perl \
perl-MIME--EncWords \
perl-POSIX \
perl-Sys--Syslog \
perl-Time--Local \
perl-Try--Tiny \
perl-strict \
php \
php-any-db \
php-mbstring \
php-phar \
php-spl \
shadow"

inherit rpm
