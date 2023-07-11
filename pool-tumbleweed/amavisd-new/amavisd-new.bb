SUMMARY = "High-Performance E-Mail Virus Scanner"
DESCRIPTION = "Amavisd-new is a high-performance interface between mailer (MTA) and \
content checkers: virus scanners or SpamAssassin. It talks to the MTA \
via (E)SMTP, LMTP. It works with the \
following MTAs: \
 \
- postfix \
- sendmail (sendmail-milter) \
- exim"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "amavisd-new-2.13.0-2.2.noarch.rpm"
RPM_HASH = "b01c74c4810cdbc9de164c3b4c6b86e0a075282c4c316f1e39e677572f72c8a4e7ac2d4812091b094808e161223d9919a4aa85c9a0f096425e9bebc46ebba40d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amavisd-new \
config-amavisd-new \
perl-Amavis \
perl-Amavis--AV \
perl-Amavis--Boot \
perl-Amavis--Conf \
perl-Amavis--Custom \
perl-Amavis--DB \
perl-Amavis--DB--SNMP \
perl-Amavis--DKIM \
perl-Amavis--DKIM--CustomSigner \
perl-Amavis--DbgLog \
perl-Amavis--Expand \
perl-Amavis--IO--FileHandle \
perl-Amavis--IO--RW \
perl-Amavis--IO--SQL \
perl-Amavis--IO--Zlib \
perl-Amavis--In--AMPDP \
perl-Amavis--In--Connection \
perl-Amavis--In--Message \
perl-Amavis--In--Message--PerRecip \
perl-Amavis--In--SMTP \
perl-Amavis--JSON \
perl-Amavis--LDAP--Connection \
perl-Amavis--Log \
perl-Amavis--Lookup \
perl-Amavis--Lookup--DNSxL \
perl-Amavis--Lookup--IP \
perl-Amavis--Lookup--LDAP \
perl-Amavis--Lookup--LDAPattr \
perl-Amavis--Lookup--Label \
perl-Amavis--Lookup--Opaque \
perl-Amavis--Lookup--OpaqueRef \
perl-Amavis--Lookup--RE \
perl-Amavis--Lookup--SQL \
perl-Amavis--Lookup--SQLfield \
perl-Amavis--MIME--Body--OnOpenFh \
perl-Amavis--Notify \
perl-Amavis--OS-Fingerprint \
perl-Amavis--Out \
perl-Amavis--Out--BSMTP \
perl-Amavis--Out--EditHeader \
perl-Amavis--Out--Local \
perl-Amavis--Out--Pipe \
perl-Amavis--Out--SMTP \
perl-Amavis--Out--SMTP--Protocol \
perl-Amavis--Out--SMTP--Session \
perl-Amavis--Out--SQL--Connection \
perl-Amavis--Out--SQL--Log \
perl-Amavis--Out--SQL--Quarantine \
perl-Amavis--ProcControl \
perl-Amavis--Redis \
perl-Amavis--SpamControl \
perl-Amavis--SpamControl--ExtProg \
perl-Amavis--SpamControl--RspamdClient \
perl-Amavis--SpamControl--SpamAssassin \
perl-Amavis--SpamControl--SpamdClient \
perl-Amavis--TempDir \
perl-Amavis--Timing \
perl-Amavis--TinyRedis \
perl-Amavis--Tools \
perl-Amavis--UnmangleSender \
perl-Amavis--Unpackers \
perl-Amavis--Unpackers--MIME \
perl-Amavis--Unpackers--NewFilename \
perl-Amavis--Unpackers--OurFiler \
perl-Amavis--Unpackers--Part \
perl-Amavis--Unpackers--Validity \
perl-Amavis--Util \
perl-Amavis--ZMQ \
perl-Amavis--rfc2821-2822-Tools \
perl-JpegTester \
perl-Mail--SpamAssassin--Logger--Amavislog"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/newaliases \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
file \
fillup \
group-vscan \
perl-Archive--Zip \
perl-Compress--Raw--Zlib \
perl-Compress--Zlib \
perl-Convert--BinHex \
perl-Digest--MD5 \
perl-IO--Socket--SSL \
perl-IO--Stringy \
perl-MIME--Base64 \
perl-MIME--Parser \
perl-Mail--DKIM \
perl-Mail--Internet \
perl-Net--Domain \
perl-Net--LibIDN2 \
perl-Net--Server \
perl-Time--HiRes \
perl-Unix--Syslog \
smtp-daemon \
user-vscan"

inherit rpm
