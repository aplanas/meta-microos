SUMMARY = "The openQA web-frontend, scheduler and tools"
DESCRIPTION = "openQA is a testing framework that allows you to test GUI applications on one \
hand and bootloader and kernel on the other. In both cases, it is difficult to \
script tests and verify the output. Output can be a popup window or it can be \
an error in early boot even before init is executed. \
 \
openQA is an automated test tool that makes it possible to test the whole \
installation process of an operating system. It uses virtual machines to \
reproduce the process, check the output (both serial console and screen) in \
every step and send the necessary keystrokes and commands to proceed to the \
next. openQA can check whether the system can be installed, whether it works \
properly in 'live' mode, whether applications work or whether the system \
responds as expected to different installation options and commands. \
 \
Even more importantly, openQA can run several combinations of tests for every \
revision of the operating system, reporting the errors detected for each \
combination of hardware configuration, installation options and variant of the \
operating system."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "4d9e11e0166688ccbc095c86169c63a20809a5ef63c06a3015b49b378a4b93adda72ed25d9ed05685a6208b525ccc675248f6a0aa90780614722cef8b1f168e4"

RPROVIDES:${PN} += "config-openQA \
group-geekotest \
openQA \
perl-DBIx--Class--Timestamps \
perl-OpenQA--LiveHandler \
perl-OpenQA--Resource--Jobs \
perl-OpenQA--Resource--Locks \
perl-OpenQA--Scheduler--Client \
perl-OpenQA--Scheduler--Controller--API \
perl-OpenQA--Scheduler--Model--Jobs \
perl-OpenQA--Schema--Profiler \
perl-OpenQA--Schema--Result--ApiKeys \
perl-OpenQA--Schema--Result--Assets \
perl-OpenQA--Schema--Result--AuditEvents \
perl-OpenQA--Schema--Result--Bugs \
perl-OpenQA--Schema--Result--Comments \
perl-OpenQA--Schema--Result--DeveloperSessions \
perl-OpenQA--Schema--Result--GruDependencies \
perl-OpenQA--Schema--Result--GruTasks \
perl-OpenQA--Schema--Result--JobDependencies \
perl-OpenQA--Schema--Result--JobGroupParents \
perl-OpenQA--Schema--Result--JobGroups \
perl-OpenQA--Schema--Result--JobLocks \
perl-OpenQA--Schema--Result--JobModules \
perl-OpenQA--Schema--Result--JobNetworks \
perl-OpenQA--Schema--Result--JobNextPrevious \
perl-OpenQA--Schema--Result--JobSettings \
perl-OpenQA--Schema--Result--JobTemplateSettings \
perl-OpenQA--Schema--Result--JobTemplates \
perl-OpenQA--Schema--Result--Jobs \
perl-OpenQA--Schema--Result--JobsAssets \
perl-OpenQA--Schema--Result--MachineSettings \
perl-OpenQA--Schema--Result--Machines \
perl-OpenQA--Schema--Result--NeedleDirs \
perl-OpenQA--Schema--Result--Needles \
perl-OpenQA--Schema--Result--ProductSettings \
perl-OpenQA--Schema--Result--Products \
perl-OpenQA--Schema--Result--ScheduledProducts \
perl-OpenQA--Schema--Result--ScreenshotLinks \
perl-OpenQA--Schema--Result--Screenshots \
perl-OpenQA--Schema--Result--Secrets \
perl-OpenQA--Schema--Result--TestSuiteSettings \
perl-OpenQA--Schema--Result--TestSuites \
perl-OpenQA--Schema--Result--Users \
perl-OpenQA--Schema--Result--WorkerProperties \
perl-OpenQA--Schema--Result--Workers \
perl-OpenQA--Schema--ResultSet--Assets \
perl-OpenQA--Schema--ResultSet--AuditEvents \
perl-OpenQA--Schema--ResultSet--Bugs \
perl-OpenQA--Schema--ResultSet--Comments \
perl-OpenQA--Schema--ResultSet--DeveloperSessions \
perl-OpenQA--Schema--ResultSet--JobGroupParents \
perl-OpenQA--Schema--ResultSet--JobSettings \
perl-OpenQA--Schema--ResultSet--JobTemplates \
perl-OpenQA--Schema--ResultSet--Jobs \
perl-OpenQA--Schema--ResultSet--Needles \
perl-OpenQA--Schema--ResultSet--ScheduledProducts \
perl-OpenQA--Schema--ResultSet--Screenshots \
perl-OpenQA--Schema--ResultSet--Users \
perl-OpenQA--WebAPI--Auth--Fake \
perl-OpenQA--WebAPI--Auth--OAuth2 \
perl-OpenQA--WebAPI--Auth--OpenID \
perl-OpenQA--WebAPI--Command--gru \
perl-OpenQA--WebAPI--Command--gru--list \
perl-OpenQA--WebAPI--Command--gru--run \
perl-OpenQA--WebAPI--Controller--API--V1 \
perl-OpenQA--WebAPI--Controller--API--V1--Asset \
perl-OpenQA--WebAPI--Controller--API--V1--Bug \
perl-OpenQA--WebAPI--Controller--API--V1--Command \
perl-OpenQA--WebAPI--Controller--API--V1--Comment \
perl-OpenQA--WebAPI--Controller--API--V1--Feature \
perl-OpenQA--WebAPI--Controller--API--V1--Iso \
perl-OpenQA--WebAPI--Controller--API--V1--Job \
perl-OpenQA--WebAPI--Controller--API--V1--JobGroup \
perl-OpenQA--WebAPI--Controller--API--V1--JobSettings \
perl-OpenQA--WebAPI--Controller--API--V1--JobTemplate \
perl-OpenQA--WebAPI--Controller--API--V1--Locks \
perl-OpenQA--WebAPI--Controller--API--V1--Mm \
perl-OpenQA--WebAPI--Controller--API--V1--Search \
perl-OpenQA--WebAPI--Controller--API--V1--Table \
perl-OpenQA--WebAPI--Controller--API--V1--User \
perl-OpenQA--WebAPI--Controller--API--V1--Webhook \
perl-OpenQA--WebAPI--Controller--API--V1--Worker \
perl-OpenQA--WebAPI--Controller--Admin--ActivityView \
perl-OpenQA--WebAPI--Controller--Admin--Asset \
perl-OpenQA--WebAPI--Controller--Admin--AuditLog \
perl-OpenQA--WebAPI--Controller--Admin--Influxdb \
perl-OpenQA--WebAPI--Controller--Admin--JobGroup \
perl-OpenQA--WebAPI--Controller--Admin--JobTemplate \
perl-OpenQA--WebAPI--Controller--Admin--Machine \
perl-OpenQA--WebAPI--Controller--Admin--Needle \
perl-OpenQA--WebAPI--Controller--Admin--Product \
perl-OpenQA--WebAPI--Controller--Admin--Table \
perl-OpenQA--WebAPI--Controller--Admin--TestSuite \
perl-OpenQA--WebAPI--Controller--Admin--User \
perl-OpenQA--WebAPI--Controller--Admin--Workers \
perl-OpenQA--WebAPI--Controller--ApiKey \
perl-OpenQA--WebAPI--Controller--Appearance \
perl-OpenQA--WebAPI--Controller--Developer \
perl-OpenQA--WebAPI--Controller--File \
perl-OpenQA--WebAPI--Controller--Main \
perl-OpenQA--WebAPI--Controller--Running \
perl-OpenQA--WebAPI--Controller--Step \
perl-OpenQA--WebAPI--Controller--Test \
perl-OpenQA--WebAPI--Description \
perl-OpenQA--WebAPI--Plugin--AMQP \
perl-OpenQA--WebAPI--Plugin--AuditLog \
perl-OpenQA--WebAPI--Plugin--HashedParams \
perl-OpenQA--WebAPI--Plugin--Helpers \
perl-OpenQA--WebAPI--Plugin--MIMETypes \
perl-OpenQA--WebAPI--Plugin--MemoryLimit \
perl-OpenQA--WebAPI--Plugin--ObsRsync \
perl-OpenQA--WebAPI--Plugin--ObsRsync--Controller--Folders \
perl-OpenQA--WebAPI--Plugin--ObsRsync--Controller--Gru \
perl-OpenQA--WebAPI--Plugin--ObsRsync--Task \
perl-OpenQA--WebAPI--Plugin--REST \
perl-OpenQA--WebAPI--Plugin--YAML \
perl-OpenQA--WebAPI--ServerSideDataTable \
perl-OpenQA--WebSockets--Client \
perl-OpenQA--WebSockets--Controller--API \
perl-OpenQA--WebSockets--Controller--Worker \
perl-OpenQA--WebSockets--Model--Status \
perl-OpenQA--WebSockets--Plugin--Helpers \
user-geekotest"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bsdtar \
coreutils \
git-core \
group-nogroup \
hostname \
openQA-client \
openQA-common \
perl-BSD--Resource \
perl-CSS--Minifier--XS \
perl-Carp \
perl-CommonMark \
perl-Config--Tiny \
perl-DBD--Pg \
perl-DBI \
perl-DBIx--Class \
perl-DBIx--Class--DeploymentHandler \
perl-DBIx--Class--DynamicDefault \
perl-DBIx--Class--OptimisticLocking \
perl-DBIx--Class--ResultClass--HashRefInflator \
perl-DBIx--Class--Schema--Config \
perl-DBIx--Class--Storage--Statistics \
perl-Date--Format \
perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Format--Pg \
perl-Exporter \
perl-Fcntl \
perl-File--Basename \
perl-File--Copy \
perl-File--Copy--Recursive \
perl-File--Path \
perl-File--Spec \
perl-FindBin \
perl-Getopt--Long--Descriptive \
perl-IO--Handle \
perl-IPC--Run \
perl-JSON--Validator \
perl-JavaScript--Minifier--XS \
perl-LWP--UserAgent \
perl-Minion \
perl-Module--Load--Conditional \
perl-Module--Pluggable \
perl-Mojo--Base \
perl-Mojo--ByteStream \
perl-Mojo--IOLoop \
perl-Mojo--JSON \
perl-Mojo--Pg \
perl-Mojo--RabbitMQ--Client \
perl-Mojo--URL \
perl-Mojo--Util \
perl-Mojolicious--Commands \
perl-Mojolicious--Plugin \
perl-Mojolicious--Plugin--AssetPack \
perl-Mojolicious--Plugin--OAuth2 \
perl-Mojolicious--Static \
perl-Mojolicious-Plugin-AssetPack \
perl-Net--OpenID--Consumer \
perl-POSIX \
perl-Pod--POM \
perl-SQL--SplitStatement \
perl-SQL--Translator \
perl-Scalar--Util \
perl-Sort--Versions \
perl-Text--Diff \
perl-Time--HiRes \
perl-Time--ParseDate \
perl-Time--Piece \
perl-Time--Seconds \
perl-URI--Escape \
perl-YAML--PP \
perl-YAML--XS \
perl-aliased \
perl-base \
perl-constant \
perl-diagnostics \
perl-strict \
perl-warnings \
systemd \
sysuser-shadow"

inherit rpm
