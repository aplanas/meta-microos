SUMMARY = "The openQA worker"
DESCRIPTION = "The openQA worker manages test engine (provided by os-autoinst package)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-worker-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "9520a605f6fba97e251e2d4ff773dd4a1b993d72442e463b98a23a5e9cd5425ed6495ec17887566287541ad3a814e171d81a37fb4a3662665b4281fb8f22ccc4"

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
