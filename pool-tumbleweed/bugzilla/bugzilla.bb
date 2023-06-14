SUMMARY = "Bug tracker for software development"
DESCRIPTION = "Bugzilla is server software designed to help you manage software \
development. \
 \
* Optimized database structure for increased performance and \
  scalability \
* Excellent security to protect confidentiality \
* Advanced query tool that can remember your searches \
* Integrated email capabilities \
* Editable user profiles and comprehensive email preferences \
* Comprehensive permissions system \
* Proven under fire as Mozilla's bug tracking system"
LICENSE = "MPL-2.0"

PV = "5.0.6"

RPM_NAME = "bugzilla-5.0.6-5.1.noarch.rpm"
RPM_HASH = "610538de03b59d8049f4e9a104e62f1ccb83f54a307594a5b47dd80fb3d6ce998045524b043a1a9dafca1a5fb9cbd5e39ca9599b90d1d094c3d1de498670bb52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bugzilla \
perl-Bugzilla \
perl-Bugzilla--Attachment \
perl-Bugzilla--Attachment--PatchReader \
perl-Bugzilla--Auth \
perl-Bugzilla--Auth--Login \
perl-Bugzilla--Auth--Login--APIKey \
perl-Bugzilla--Auth--Login--CGI \
perl-Bugzilla--Auth--Login--Cookie \
perl-Bugzilla--Auth--Login--Env \
perl-Bugzilla--Auth--Login--Stack \
perl-Bugzilla--Auth--Persist--Cookie \
perl-Bugzilla--Auth--Verify \
perl-Bugzilla--Auth--Verify--DB \
perl-Bugzilla--Auth--Verify--LDAP \
perl-Bugzilla--Auth--Verify--RADIUS \
perl-Bugzilla--Auth--Verify--Stack \
perl-Bugzilla--Bug \
perl-Bugzilla--BugMail \
perl-Bugzilla--BugUrl \
perl-Bugzilla--BugUrl--Bugzilla \
perl-Bugzilla--BugUrl--Bugzilla--Local \
perl-Bugzilla--BugUrl--Debian \
perl-Bugzilla--BugUrl--GitHub \
perl-Bugzilla--BugUrl--Google \
perl-Bugzilla--BugUrl--JIRA \
perl-Bugzilla--BugUrl--Launchpad \
perl-Bugzilla--BugUrl--MantisBT \
perl-Bugzilla--BugUrl--SourceForge \
perl-Bugzilla--BugUrl--Trac \
perl-Bugzilla--BugUserLastVisit \
perl-Bugzilla--CGI \
perl-Bugzilla--Chart \
perl-Bugzilla--Classification \
perl-Bugzilla--Comment \
perl-Bugzilla--Comment--TagWeights \
perl-Bugzilla--Component \
perl-Bugzilla--Config \
perl-Bugzilla--Config--Admin \
perl-Bugzilla--Config--Advanced \
perl-Bugzilla--Config--Attachment \
perl-Bugzilla--Config--Auth \
perl-Bugzilla--Config--BugChange \
perl-Bugzilla--Config--BugFields \
perl-Bugzilla--Config--Common \
perl-Bugzilla--Config--Core \
perl-Bugzilla--Config--DependencyGraph \
perl-Bugzilla--Config--General \
perl-Bugzilla--Config--GroupSecurity \
perl-Bugzilla--Config--LDAP \
perl-Bugzilla--Config--MTA \
perl-Bugzilla--Config--Memcached \
perl-Bugzilla--Config--Query \
perl-Bugzilla--Config--RADIUS \
perl-Bugzilla--Config--ShadowDB \
perl-Bugzilla--Config--UserMatch \
perl-Bugzilla--Constants \
perl-Bugzilla--DB \
perl-Bugzilla--DB--Mysql \
perl-Bugzilla--DB--Oracle \
perl-Bugzilla--DB--Oracle--st \
perl-Bugzilla--DB--Pg \
perl-Bugzilla--DB--Schema \
perl-Bugzilla--DB--Schema--Mysql \
perl-Bugzilla--DB--Schema--Oracle \
perl-Bugzilla--DB--Schema--Pg \
perl-Bugzilla--DB--Schema--Sqlite \
perl-Bugzilla--DB--Sqlite \
perl-Bugzilla--Error \
perl-Bugzilla--Extension \
perl-Bugzilla--Extension--BmpConvert \
perl-Bugzilla--Extension--Example \
perl-Bugzilla--Extension--Example--Auth--Login \
perl-Bugzilla--Extension--Example--Auth--Verify \
perl-Bugzilla--Extension--Example--Config \
perl-Bugzilla--Extension--Example--Util \
perl-Bugzilla--Extension--Example--WebService \
perl-Bugzilla--Extension--MoreBugUrl \
perl-Bugzilla--Extension--MoreBugUrl--BitBucket \
perl-Bugzilla--Extension--MoreBugUrl--GetSatisfaction \
perl-Bugzilla--Extension--MoreBugUrl--PHP \
perl-Bugzilla--Extension--MoreBugUrl--RT \
perl-Bugzilla--Extension--MoreBugUrl--Redmine \
perl-Bugzilla--Extension--MoreBugUrl--ReviewBoard \
perl-Bugzilla--Extension--MoreBugUrl--Rietveld \
perl-Bugzilla--Extension--MoreBugUrl--Savane \
perl-Bugzilla--Extension--OldBugMove \
perl-Bugzilla--Extension--OldBugMove--Params \
perl-Bugzilla--Extension--Voting \
perl-Bugzilla--Field \
perl-Bugzilla--Field--Choice \
perl-Bugzilla--Field--ChoiceInterface \
perl-Bugzilla--Flag \
perl-Bugzilla--FlagType \
perl-Bugzilla--Group \
perl-Bugzilla--Hook \
perl-Bugzilla--Install \
perl-Bugzilla--Install--CPAN \
perl-Bugzilla--Install--DB \
perl-Bugzilla--Install--Filesystem \
perl-Bugzilla--Install--Localconfig \
perl-Bugzilla--Install--Requirements \
perl-Bugzilla--Install--Util \
perl-Bugzilla--Job--BugMail \
perl-Bugzilla--Job--Mailer \
perl-Bugzilla--JobQueue \
perl-Bugzilla--JobQueue--Runner \
perl-Bugzilla--Keyword \
perl-Bugzilla--MIME \
perl-Bugzilla--Mailer \
perl-Bugzilla--Memcached \
perl-Bugzilla--Migrate \
perl-Bugzilla--Migrate--Gnats \
perl-Bugzilla--Milestone \
perl-Bugzilla--Object \
perl-Bugzilla--Product \
perl-Bugzilla--RNG \
perl-Bugzilla--Report \
perl-Bugzilla--Search \
perl-Bugzilla--Search--Clause \
perl-Bugzilla--Search--ClauseGroup \
perl-Bugzilla--Search--Condition \
perl-Bugzilla--Search--Quicksearch \
perl-Bugzilla--Search--Recent \
perl-Bugzilla--Search--Saved \
perl-Bugzilla--Sender--Transport--Sendmail \
perl-Bugzilla--Series \
perl-Bugzilla--Status \
perl-Bugzilla--Template \
perl-Bugzilla--Template--Context \
perl-Bugzilla--Template--Plugin--Bugzilla \
perl-Bugzilla--Template--Plugin--Hook \
perl-Bugzilla--Test--Search \
perl-Bugzilla--Test--Search--AndTest \
perl-Bugzilla--Test--Search--Constants \
perl-Bugzilla--Test--Search--CustomTest \
perl-Bugzilla--Test--Search--FieldTest \
perl-Bugzilla--Test--Search--FieldTestNormal \
perl-Bugzilla--Test--Search--InjectionTest \
perl-Bugzilla--Test--Search--NotTest \
perl-Bugzilla--Test--Search--OperatorTest \
perl-Bugzilla--Test--Search--OrTest \
perl-Bugzilla--Token \
perl-Bugzilla--Update \
perl-Bugzilla--User \
perl-Bugzilla--User--APIKey \
perl-Bugzilla--User--Setting \
perl-Bugzilla--User--Setting--Lang \
perl-Bugzilla--User--Setting--Skin \
perl-Bugzilla--User--Setting--Timezone \
perl-Bugzilla--UserAgent \
perl-Bugzilla--Util \
perl-Bugzilla--Version \
perl-Bugzilla--WebService \
perl-Bugzilla--WebService--Bug \
perl-Bugzilla--WebService--BugUserLastVisit \
perl-Bugzilla--WebService--Bugzilla \
perl-Bugzilla--WebService--Classification \
perl-Bugzilla--WebService--Component \
perl-Bugzilla--WebService--Constants \
perl-Bugzilla--WebService--FlagType \
perl-Bugzilla--WebService--Group \
perl-Bugzilla--WebService--Product \
perl-Bugzilla--WebService--Server \
perl-Bugzilla--WebService--Server--JSONRPC \
perl-Bugzilla--WebService--Server--REST \
perl-Bugzilla--WebService--Server--REST--Resources--Bug \
perl-Bugzilla--WebService--Server--REST--Resources--BugUserLastVisit \
perl-Bugzilla--WebService--Server--REST--Resources--Bugzilla \
perl-Bugzilla--WebService--Server--REST--Resources--Classification \
perl-Bugzilla--WebService--Server--REST--Resources--Component \
perl-Bugzilla--WebService--Server--REST--Resources--FlagType \
perl-Bugzilla--WebService--Server--REST--Resources--Group \
perl-Bugzilla--WebService--Server--REST--Resources--Product \
perl-Bugzilla--WebService--Server--REST--Resources--User \
perl-Bugzilla--WebService--Server--XMLRPC \
perl-Bugzilla--WebService--User \
perl-Bugzilla--WebService--Util \
perl-Bugzilla--Whine \
perl-Bugzilla--Whine--Query \
perl-Bugzilla--Whine--Schedule \
perl-Bugzilla--XMLRPC--Deserializer \
perl-Bugzilla--XMLRPC--SOM \
perl-Bugzilla--XMLRPC--Serializer \
perl-Pod--Simple--HTML--Bugzilla \
perl-Pod--Simple--HTMLBatch--Bugzilla \
perl-Support--Files \
perl-Support--Systemexec \
perl-Support--Templates"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
patchutils \
perl-Authen-SASL \
perl-CGI \
perl-Cache-Memcached \
perl-Chart \
perl-DBD-Pg \
perl-DBD-SQLite \
perl-DBD-mysql \
perl-DBI \
perl-Daemon-Generic \
perl-DateTime \
perl-DateTime-TimeZone \
perl-Digest-SHA1 \
perl-Email-MIME \
perl-Email-Reply \
perl-Email-Send \
perl-Email-Sender \
perl-Encode \
perl-Encode-Detect \
perl-File-Copy-Recursive \
perl-File-MimeInfo \
perl-File-Slurp \
perl-File-Which \
perl-GD \
perl-GDGraph \
perl-GDTextUtil \
perl-HTML-FormatText-WithLinks \
perl-HTML-Parser \
perl-HTML-Scrubber \
perl-IO-stringy \
perl-JSON-RPC \
perl-JSON-XS \
perl-List-MoreUtils \
perl-MIME-tools \
perl-Math-Random-ISAAC \
perl-Module-Pluggable \
perl-Net-SMTP-SSL \
perl-Object-Pluggable \
perl-PatchReader \
perl-SOAP-Lite \
perl-Template-GD \
perl-Template-Toolkit \
perl-Test-Taint \
perl-TheSchwartz \
perl-TimeDate \
perl-URI \
perl-XML-Twig \
perl-XMLRPC-Lite \
perl-base \
perl-ldap \
perl-libwww-perl \
systemd"

inherit rpm
