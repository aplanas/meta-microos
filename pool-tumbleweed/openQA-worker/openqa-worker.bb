SUMMARY = "The openQA worker"
DESCRIPTION = "The openQA worker manages test engine (provided by os-autoinst package)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-worker-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "f66e504d7878b53fb385c1d608faf31a9d16212848507c019cdbe1ba6bdecbf8ecfd55de9f340e53b6082b22349342d3f7397322ab3fb47b24a9d577aea6e6ca"

RPROVIDES:${PN} += "config-openQA-worker \
group--openqa-worker \
openQA-worker \
perl-OpenQA--CacheService--Client \
perl-OpenQA--CacheService--Command--run \
perl-OpenQA--CacheService--Controller--API \
perl-OpenQA--CacheService--Controller--Influxdb \
perl-OpenQA--CacheService--Model--Cache \
perl-OpenQA--CacheService--Model--Downloads \
perl-OpenQA--CacheService--Plugin--Helpers \
perl-OpenQA--CacheService--Request \
perl-OpenQA--CacheService--Request--Asset \
perl-OpenQA--CacheService--Request--Sync \
perl-OpenQA--CacheService--Response \
perl-OpenQA--CacheService--Response--Info \
perl-OpenQA--CacheService--Response--Status \
perl-OpenQA--CacheService--Task--Asset \
perl-OpenQA--CacheService--Task--Sync \
perl-OpenQA--Worker--App \
perl-OpenQA--Worker--CommandHandler \
perl-OpenQA--Worker--Engines--isotovideo \
perl-OpenQA--Worker--Isotovideo--Client \
perl-OpenQA--Worker--Job \
perl-OpenQA--Worker--Settings \
perl-OpenQA--Worker--WebUIConnection \
user--openqa-worker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bsdtar \
coreutils \
group-nogroup \
openQA-client \
openQA-common \
optipng \
os-autoinst \
perl-Capture--Tiny \
perl-File--Map \
perl-Minion--Backend--SQLite \
perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--SQLite \
perl-SQL--SplitStatement \
psmisc \
sqlite3"

inherit rpm
