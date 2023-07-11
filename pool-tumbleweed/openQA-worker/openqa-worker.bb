SUMMARY = "The openQA worker"
DESCRIPTION = "The openQA worker manages test engine (provided by os-autoinst package)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-worker-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "408abafd33a7cfa312c8b6fb4e1d0236937fe6a4883d27cce1a78a0acbdf823b53a21efe332f67160afb017c1218da69d282becc89eefba1793e9bc8dcdb0ffe"

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
