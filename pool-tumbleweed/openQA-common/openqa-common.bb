SUMMARY = "The openQA common tools for web-frontend and workers"
DESCRIPTION = "This package contain shared resources for openQA web-frontend and \
openQA workers."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-common-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "8dc7dfb2ec786c457963601301ce40f9076fed3e1c843cb972c0a17b08fddb318a6aabd03c603095136de04808e67d3feda0c699309971dc29c9336668ce1cfe"

RPROVIDES:${PN} += "openQA-common \
perl-OpenQA \
perl-OpenQA--App \
perl-OpenQA--BuildResults \
perl-OpenQA--CLI \
perl-OpenQA--CLI--api \
perl-OpenQA--CLI--archive \
perl-OpenQA--CLI--schedule \
perl-OpenQA--CacheService \
perl-OpenQA--Command \
perl-OpenQA--Constants \
perl-OpenQA--Downloader \
perl-OpenQA--Events \
perl-OpenQA--File \
perl-OpenQA--Files \
perl-OpenQA--Git \
perl-OpenQA--JobDependencies--Constants \
perl-OpenQA--JobGroupDefaults \
perl-OpenQA--JobSettings \
perl-OpenQA--Jobs--Constants \
perl-OpenQA--LiveHandler--Controller--LiveViewHandler \
perl-OpenQA--Log \
perl-OpenQA--Markdown \
perl-OpenQA--Parser \
perl-OpenQA--Parser--Format--Base \
perl-OpenQA--Parser--Format--IPA \
perl-OpenQA--Parser--Format--JUnit \
perl-OpenQA--Parser--Format--LTP \
perl-OpenQA--Parser--Format--TAP \
perl-OpenQA--Parser--Format--XUnit \
perl-OpenQA--Parser--Result \
perl-OpenQA--Parser--Result--IPA--Info \
perl-OpenQA--Parser--Result--LTP--Environment \
perl-OpenQA--Parser--Result--LTP--SubTest \
perl-OpenQA--Parser--Result--LTP--Test \
perl-OpenQA--Parser--Result--Node \
perl-OpenQA--Parser--Result--OpenQA \
perl-OpenQA--Parser--Result--OpenQA--Results \
perl-OpenQA--Parser--Result--Output \
perl-OpenQA--Parser--Result--Test \
perl-OpenQA--Parser--Result--XUnit \
perl-OpenQA--Parser--Result--XUnit--Property \
perl-OpenQA--Parser--Results \
perl-OpenQA--Scheduler \
perl-OpenQA--Schema \
perl-OpenQA--ScreenshotDeletion \
perl-OpenQA--Script--Client \
perl-OpenQA--Script--CloneJob \
perl-OpenQA--Script--CloneJobSUSE \
perl-OpenQA--Setup \
perl-OpenQA--Shared--Controller--Auth \
perl-OpenQA--Shared--Controller--Session \
perl-OpenQA--Shared--GruJob \
perl-OpenQA--Shared--Plugin--CSRF \
perl-OpenQA--Shared--Plugin--Gru \
perl-OpenQA--Shared--Plugin--SharedHelpers \
perl-OpenQA--Task--Asset--Download \
perl-OpenQA--Task--Asset--Limit \
perl-OpenQA--Task--AuditEvents--Limit \
perl-OpenQA--Task--Bug--Limit \
perl-OpenQA--Task--Iso--Schedule \
perl-OpenQA--Task--Job--ArchiveResults \
perl-OpenQA--Task--Job--FinalizeResults \
perl-OpenQA--Task--Job--HookScript \
perl-OpenQA--Task--Job--Limit \
perl-OpenQA--Task--Job--Restart \
perl-OpenQA--Task--Needle--Delete \
perl-OpenQA--Task--Needle--Save \
perl-OpenQA--Task--Needle--Scan \
perl-OpenQA--Task--SignalGuard \
perl-OpenQA--Task--Utils \
perl-OpenQA--Utils \
perl-OpenQA--VcsProvider \
perl-OpenQA--WebAPI \
perl-OpenQA--WebSockets \
perl-OpenQA--Worker \
perl-OpenQA--YAML \
perl-Perl--Critic--Policy--HashKeyQuotes"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ntp-daemon \
perl \
perl-Carp--Always \
perl-Config--IniFiles \
perl-Config--Tiny \
perl-Cpanel--JSON--XS \
perl-Cwd \
perl-Data--Dump \
perl-Data--Dumper \
perl-Digest--MD5 \
perl-Filesys--Df \
perl-Getopt--Long \
perl-Minion \
perl-Mojolicious \
perl-Regexp--Common \
perl-Storable \
perl-Time--Moment \
perl-Try--Tiny"

inherit rpm
